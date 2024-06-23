package com.github.hoangsvn.compoments.entitys.novel;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Novel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;

    @Column(length = 255)
    private String name;
    private String path;
    private Long   rating;
    private Long   user_id;

    private Long   read_count;
    private String description;
    private Date   create_at;

    @OneToMany( cascade = CascadeType.DETACH ,fetch = FetchType.LAZY)
    @JoinTable(name = "service-novel-novel-categorys" ,joinColumns = @JoinColumn(name = "novel-id"), inverseJoinColumns = @JoinColumn(name = "category-id"))
    private List<Category> categorys =new ArrayList<>();

    @OneToOne( cascade = CascadeType.DETACH ,fetch = FetchType.LAZY)
    @JoinTable(name = "service-novel-novel-author" ,joinColumns = @JoinColumn(name = "novel-id"), inverseJoinColumns = @JoinColumn(name = "author-id"))
    private Author author;


}
