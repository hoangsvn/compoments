package com.github.hoangsvn.compoments.payload.response;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseType<T> implements Serializable {
    public T data;
    public boolean status;
}
