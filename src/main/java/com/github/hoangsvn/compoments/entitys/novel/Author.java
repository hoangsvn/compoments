package com.github.hoangsvn.compoments.entitys.novel;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "service-novel-authors")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    @Column(length = 255)
    private String name;
    private String path;
    private Long   rating;
    private String description;
    private Date   birthday;
    private Date   create_at;

}
