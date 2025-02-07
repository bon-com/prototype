package com.example.prototype.web.dto.type2;

import lombok.Data;

/**
 * POSTリクエスト方法
 * 
 */
@Data
public class Type2Form {
	
	private String name;
	
	private Type2ChildForm child;
}
