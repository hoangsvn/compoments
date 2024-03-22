package com.github.hoangsvn.compoments.entitys.auth;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "service-auth-users", uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User implements Serializable {
    //Start
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // SIGNIN
    @Column(length = 100)
    private String username;
	@Column(length = 100)
    private String password;
    @Column(columnDefinition = "boolean default true")
    private boolean isActive;
    @Column(columnDefinition = "boolean default true")
    private boolean isVerified;
    private Date lastLogin;
    @Column(columnDefinition = "bigint default 0")
    private Long loginAttempts;
    private Date createAt;
    private Date updateAt;
    //ROLE and Provicer
    @ElementCollection(targetClass = ERole.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "service-auth-user-roles",
            joinColumns = @JoinColumn(name = "user_id"))
    private List<ERole> roles = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private EProvider provider = EProvider.local;

	//INFO
    @Column(length = 300)
    private String avatar="";
    private String firstname="";
    private String lastname="";
    private String email="";
    private Date   datebirth;
    private String homeaddress="";
    private String workaddress="";
    private String phonenumner="";
    private String nationality="";
    private String occupation="";
    private String sociallink0="";
    private String sociallink1="";
    private String sociallink2="";
	private String sociallink3="";
    @Enumerated(EnumType.STRING)
    private EGender gender = EGender.DEFAULT;
    private String education="";
    private String description="";
    private String introduction="";
    //End
}
