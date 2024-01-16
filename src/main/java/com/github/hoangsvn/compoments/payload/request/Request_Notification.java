package com.github.hoangsvn.compoments.payload.request;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request_Notification {
	@NotBlank
	private String title;
	@NotBlank
	private String body;

}
