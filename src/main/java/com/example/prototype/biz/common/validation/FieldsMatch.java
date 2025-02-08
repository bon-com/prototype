package com.example.prototype.biz.common.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * 相関チェック用のアノテーションクラス
 * 
 */
@Documented
@Constraint(validatedBy = { FieldsMatchValidator.class })
@Retention(RUNTIME)
@Repeatable(FieldsMatchList.class) 
@Target({ TYPE, ANNOTATION_TYPE })
public @interface FieldsMatch {
	String message() default "{FieldsMatch.default.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	/** チェック対象 */
	String property();

	/** 比較対象 */
	String comparingProperty();
}
