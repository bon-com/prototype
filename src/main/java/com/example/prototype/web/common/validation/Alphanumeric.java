package com.example.prototype.web.common.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;

/**
 * 独自アノテーション
 * 【英数字】且つ【8～16文字】であること
 * 詳細：https://techorgana.com/java/java_web_flamework/spring/4683/
 */
@Documented
@Constraint(validatedBy = {})
@Retention(RUNTIME)
@Target({ FIELD, METHOD, PARAMETER, CONSTRUCTOR, ANNOTATION_TYPE })
@ReportAsSingleViolation
@Pattern(regexp = "^[a-zA-Z0-9]{8,16}$")
public @interface Alphanumeric {
	String message() default "";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
