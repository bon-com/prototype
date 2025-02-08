package com.example.prototype.web.common.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.util.ObjectUtils;

/**
 * 相関チェック用のバリデーションロジッククラス
 *
 */
public class FieldsMatchValidator implements ConstraintValidator<FieldsMatch, Object> {
	/** チェック対象 */
	private String property;
	/** 比較対象 */
	private String comparingProperty;

	@Override
	public void initialize(FieldsMatch constraintAnnotation) {
		// フィールド名の初期化
		this.property = constraintAnnotation.property();
		this.comparingProperty = constraintAnnotation.comparingProperty();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// フィールドの値を取得
		var beanWrapper = new BeanWrapperImpl(value);
		Object propertyValue = beanWrapper.getPropertyValue(property);
		Object complaringPropertyValue = beanWrapper.getPropertyValue(comparingProperty);
		// プロパティの比較
		boolean res = ObjectUtils.nullSafeEquals(propertyValue, complaringPropertyValue);

		// チェック結果判定
		if (!res) {
			// デフォルトのメッセージを使用する場合
			context.buildConstraintViolationWithTemplate(
					context.getDefaultConstraintMessageTemplate()).addPropertyNode(property)
					.addConstraintViolation();
		}

		return res;
	}
}