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


	@Pattern(regexp = "^(?:[0-9] ?){6,14}[0-9]$", message = "Invalid phone number")
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
}
