package com.github.hoangsvn.compoments;

import com.github.hoangsvn.compoments.client.LoadClient;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({LoadClient.class})
public @interface LoadMyClient {
}
