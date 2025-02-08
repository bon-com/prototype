package com.example.prototype.web.dto.type8;

import com.example.prototype.biz.common.validation.Alphanumeric;
import com.example.prototype.biz.common.validation.FieldsMatch;

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
