package com.example.prototype.web.dto.type08;

import com.example.prototype.web.common.validation.Alphanumeric;
import com.example.prototype.web.common.validation.FieldsMatch;

import lombok.Data;

/**
 * 相関チェック独自ルール追加
 * 
 */
@Data
@FieldsMatch(property = "password", comparingProperty = "confirmPassword")
public class Type8Form {
	/** パスワード */
	@Alphanumeric
	private String password;
	
	private String confirmPassword;
}
