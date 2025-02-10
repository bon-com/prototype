package com.example.prototype.web.dto.type13;

import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * '@SessionAttributesを使用したセッション管理方法
 * 
 */
@Data
public class Type13Form {
	/** 名前 */
	@NotNull
	private String name;
}
