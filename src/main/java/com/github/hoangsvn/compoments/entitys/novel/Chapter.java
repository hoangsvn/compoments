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
public class Chapter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;
    @Column(length = 255)
    private String  name;
    private String  path;
    private String  novel_id;
    private String  content;
    private Date    create_at;

}
