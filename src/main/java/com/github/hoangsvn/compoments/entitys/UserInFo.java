package com.github.hoangsvn.compoments.entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userinfo" ,uniqueConstraints = {@UniqueConstraint(columnNames = "userid")})
public class UserInFo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long userid;
	
	@Size(max = 200)
	private String fullname;
	@Size(max = 20)
	private String phonenumber;
	@Size(max = 200)
	private String linkfacebook;
	@Size(max = 200)
	private String linkinstagram;
	@Size(max = 200)
	private String linktwitter;
	@Size(max = 200)
	private String address;
	private Date datebirth;

}
