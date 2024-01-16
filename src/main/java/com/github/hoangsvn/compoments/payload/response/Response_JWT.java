package com.github.hoangsvn.compoments.payload.response;


import lombok.*;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Response_JWT implements Serializable {
	private String token;
	private String type ;
	private Long id;
	private String username;
	private String email;
	private List<String> roles;

}
