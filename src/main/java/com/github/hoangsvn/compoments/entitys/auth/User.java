package com.github.hoangsvn.compoments.entitys.auth;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "service-auth-users", uniqueConstraints = { @UniqueConstraint(columnNames = "username"),	@UniqueConstraint(columnNames = "email") })
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30)
	private String username;

	@Column(length = 255)
	private String email;

	@Column(length = 255)
	private String password;

	@ManyToMany( fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
	@JoinTable(name = "service-auth-user-roles", joinColumns = @JoinColumn(name = "user-id"), inverseJoinColumns = @JoinColumn(name = "role-id"))
	private Set<Role> roles = new HashSet<>();

	
    @OneToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinColumn(table = "service-auth-user-userinfo",name = "id", referencedColumnName = "user-id")
    private UserInFo userinfo ;

}
