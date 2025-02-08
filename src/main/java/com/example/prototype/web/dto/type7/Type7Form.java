package com.example.prototype.web.dto.type7;

import com.example.prototype.biz.common.validation.Alphanumeric;

import lombok.Data;

/**
 * 入力チェック独自ルール追加
 * 
 */
@Data
public class Type7Form {
	/** パスワード */
	@Alphanumeric
	private String password;
}
