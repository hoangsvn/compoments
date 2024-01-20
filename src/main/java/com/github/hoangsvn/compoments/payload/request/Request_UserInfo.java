package com.github.hoangsvn.compoments.payload.request;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request_UserInfo implements Serializable {


	@NotNull(message = "Fullname cannot be Null")
	private String fullname;


	@Pattern(regexp = "^(\\d{10}|\\d{11})$", message = "Invalid phone number format is 10 or 11 digits long")
	private String phonenumber;

	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String linkfacebook;

	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String linkinstagram;

	@Pattern( regexp = "^https?://.+",  message = "Invalid URL" )
	private String linktwitter;
 
	private String address;

	@Past(message = "Date of birth must be a date in the past")
	private Date datebirth;

	private String avatar;
}
