package com.github.hoangsvn.compoments;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(LoadCompoments.class)
public @interface LoadMyCompoments {
}
