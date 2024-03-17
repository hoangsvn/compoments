package com.github.hoangsvn.compoments.payload.request;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request_UserInfo implements Serializable {

	@Pattern(regexp = "^(\\d{10}|\\d{11})$", message = "Invalid phone number format is 10 or 11 digits long")
	private String address;
	private String avatar;

	private String fistname;
	private String lastname;

	private String phonenumber;
	@Email(message = "Email Invalid")
	private String email;
	@Past(message = "Date of birth must be a date in the past")
	private Date 	datebirth;
	private String homeaddress;
	private String workaddress;
	private String phonenumner;
	private String nationality;
	private String occupation;
	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String sociallink0;
	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String sociallink1;
	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String sociallink2;
	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String sociallink3;

	private String gender ;
	private String education;
	private String description;
	private String introduction;

}
