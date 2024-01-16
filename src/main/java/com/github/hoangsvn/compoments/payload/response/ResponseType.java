package com.github.hoangsvn.compoments.payload.response;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseType<T,V> implements Serializable {
    public T data;
    public V message;
}
