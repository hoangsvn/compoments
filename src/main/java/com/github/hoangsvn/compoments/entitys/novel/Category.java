package com.github.hoangsvn.compoments.entitys.novel;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Builder
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;

    @Column(length = 255)
    private String path;

    @Column(length = 255)
    private String name;
}
