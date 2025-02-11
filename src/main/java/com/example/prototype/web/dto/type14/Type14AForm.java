package com.example.prototype.web.dto.type14;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * '@SessionScopeを使用したセッション管理方法
 * 
 */
@Data
public class Type14AForm {
	/** 名前 */
	@NotNull
	private String name;
}
