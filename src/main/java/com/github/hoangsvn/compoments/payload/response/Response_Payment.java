package com.github.hoangsvn.compoments.payload.response;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Response_Payment implements Serializable {
    private String type;
    private String urlpay;
}
