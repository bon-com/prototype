package com.example.prototype.web.common.validation;

import static com.example.prototype.biz.common.utils.CommonConstants.*;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.prototype.biz.common.form.BaseForm;

/**
 * BaseFormを継承したフォームで使用可能
 */
@Component
public class PasswordMatchValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return BaseForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if (errors.hasErrors()) {
			return;
		}
		// フィールドの値を取得
		BeanWrapperImpl beanWrapper = new BeanWrapperImpl(target);
		Object propertyValue = beanWrapper.getPropertyValue(FORM_PASSWORD);
		Object comparingPropertyValue = beanWrapper.getPropertyValue(FORM_CONFIRM_PASSWORD);
		boolean res = ObjectUtils.nullSafeEquals(propertyValue, comparingPropertyValue);

		// フィールドの比較
		if (!res) {
			errors.rejectValue(FORM_CONFIRM_PASSWORD, PASSWORD_MISMATCH_MSG_KEY);
		}
	}

}
