package cn.mutils.app.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import cn.mutils.app.core.io.serial.primitive.BoolItem;

/**
 * IOC for Boolean property of entity
 *
 * @see BoolItem
 * @see Boolean#FALSE
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface False {

    String value() default "false";

}