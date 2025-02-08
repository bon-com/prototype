package com.example.prototype.web.controller.type11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * web.xmlを使用した例外ハンドリング方法
 * 
 */
@Controller
public class Type11Controller {
	

	/**
	 * 初期画面表示
	 * @return
	 */
	@GetMapping(value = "type11/")
	public String showFirst() {
		return "type11/first";
	}
	
	/**
	 * 405を発生させるために用意したハンドラ
	 * @return
	 */
	@PostMapping(value="type11/dummy")
	public String dummyPost() {
		return "type11/first";
	}
	
	/**
	 * JSP側でorg.apache.jasper.JasperException例外を発生させるハンドラ
	 * @return
	 */
	@GetMapping(value = "type11/hoge")
	public String dummyGet() {
		return "type11/error";
	}
}
