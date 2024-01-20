package com.github.hoangsvn.compoments.entitys;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Builder
@Data
@Table(name = "userinfo" ,uniqueConstraints = {@UniqueConstraint(columnNames = "userid")})
public class UserInFo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userid;

    @Column(length = 255)
    private String fullname;
    @Column(length = 20)
    private String phonenumber;
    @Column(length = 255)
    private String linkfacebook;
    @Column(length = 255)
    private String linkinstagram;
    @Column(length = 255)
    private String linktwitter;
    @Column(length = 255)
    private String address;
    private Date datebirth;
    @Column(length = 255)
    private String avatar;

}
