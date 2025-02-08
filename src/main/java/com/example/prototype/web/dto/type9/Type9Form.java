package com.example.prototype.web.dto.type9;

import com.example.prototype.biz.common.validation.Alphanumeric;
import com.example.prototype.biz.common.validation.FieldsMatch;

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
	/** 確認用パスワード */
	private String confirmPassword;
	/** メールアドレス */
	private String email;
	/** メールアドレス（確認用） */
	private String confirmEmail;
}