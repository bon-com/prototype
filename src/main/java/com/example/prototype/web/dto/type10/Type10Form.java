package com.example.prototype.web.dto.type10;

import com.example.prototype.biz.common.form.BaseForm;
import com.example.prototype.web.common.validation.Alphanumeric;

import lombok.Data;

/**
 * 順序をつけた相関チェックを行う方法
 * 
 */
@Data
public class Type10Form extends BaseForm{
	/** パスワード */
	@Alphanumeric
	private String password;
	/** パスワード（確認用） */
	private String confirmPassword;
}
