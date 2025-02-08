package com.example.prototype.web.dto.type09;

import com.example.prototype.web.common.validation.Alphanumeric;
import com.example.prototype.web.common.validation.FieldsMatch;

import lombok.Data;

/**
 * 相関チェックを使いまわす方法
 * 
 */
@Data
@FieldsMatch(property = "password", comparingProperty = "confirmPassword")
@FieldsMatch(property = "email", comparingProperty = "confirmEmail")
public class Type9Form {
	/** パスワード */
	@Alphanumeric
	private String password;
	/** パスワード（確認用） */
	private String confirmPassword;
	/** メールアドレス */
	private String email;
	/** メールアドレス（確認用） */
	private String confirmEmail;
}