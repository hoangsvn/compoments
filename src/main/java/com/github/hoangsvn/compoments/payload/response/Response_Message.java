package com.github.hoangsvn.compoments.payload.response;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response_Message implements Serializable {
	private String message ;
	private String type;
}
