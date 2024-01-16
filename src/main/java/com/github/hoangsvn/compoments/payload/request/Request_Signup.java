package com.github.hoangsvn.compoments.payload.request;

import jakarta.validation.constraints.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request_Signup  implements Serializable {
	@NotBlank(message = "Username cannot be Blank")
	@NotNull(message = "Username cannot be null")
	@NotEmpty(message = "Username is required")
	@Size(min = 3, max = 20, message = "Username must be between 3 and 20 characters")
	private String username;

	@NotEmpty(message = "Email is required")
	@Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$", message = "Invalid email address")
	@Email(message = "Invalid email address")
	private String email;
	
	private String fullname;
	
	private Set<String> role;

	@Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
			message = "Password must contain at least one lowercase letter, one uppercase letter, one digit, and one special character")
	@NotEmpty(message = "Password is required")
	@NotNull(message = "Password cannot be null")
	private String password;

}
