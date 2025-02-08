package com.example.prototype.web.controller.type12;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HandlerExceptionResolverを使用した例外ハンドリング方法
 * 
 */
@Controller
public class Type12Controller {
	

	/**
	 * 初期画面表示
	 * @return
	 */
	@GetMapping(value = "type12/")
	public String showFirst() {
		return "type12/first";
	}
	
	/**
	 * 
	 * @return
	 */
	@GetMapping(value="type12/error1")
	public String error1() {
		throw new NullPointerException("例外を発生させる");
	}
	
	/**
	 * JSP側でorg.apache.jasper.JasperException例外を発生させるハンドラ
	 * @return
	 */
	@GetMapping(value = "type12/error2")
	public String error2() {
		Integer.parseInt("あ");
		return "type12/first";
	}
}
