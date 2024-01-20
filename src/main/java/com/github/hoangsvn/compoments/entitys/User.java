package com.github.hoangsvn.compoments.entitys;

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
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "username"),	@UniqueConstraint(columnNames = "email") })
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 30)
	private String username;

	@Column(length = 250)
	private String email;

	@Column(length = 30)
	private String password;
	


	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet<>();

 
	 
	
    @OneToOne(cascade = CascadeType.ALL ,targetEntity = UserInFo.class)
    @JoinColumn(name = "id", referencedColumnName = "userid")
    private UserInFo userinfo ;

}
