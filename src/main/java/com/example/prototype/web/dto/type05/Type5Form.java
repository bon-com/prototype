package com.example.prototype.web.dto.type05;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * 入力チェックの基本
 * 
 */
@Data
public class Type5Form {
	/** 名前 */
	@NotNull
	private String name;
}
