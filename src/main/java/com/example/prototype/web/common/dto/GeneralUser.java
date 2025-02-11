package com.example.prototype.web.common.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import lombok.Data;

/**
 * '@SessionScopeを使用したセッション管理方法
 * セッションスコープのBeanとしてDIコンテナで管理する
 */
@Component
@SessionScope
@Data
public class GeneralUser {

	/** 名前 */
	private String name;
}
