package com.example.prototype.web.controller.type01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.prototype.web.dto.type01.Type1Form;

/**
 * GETリクエスト方法
 * 
 */
@Controller
public class Type1Controller {
	
	/** ロガー */
	private static final Logger logger = LoggerFactory.getLogger(Type1Controller.class);
	
	/**
	 * 初期画面表示
	 * @return
	 */
	@GetMapping(value = "type1/")
	public String showFirst() {
		return "type01/first";
	}
	
	/**
	 * パスパラメータ取得その１
	 * @param id
	 * @return
	 */
	@GetMapping(value="type1/foo/{id}")
	public String pattern1(@PathVariable int id) {
		logger.debug("★★★id：" + id + "★★★\n");
		return "type01/first";
	}
	
	/**
	 * パスパラメータ取得その２
	 * @param companyId
	 * @param id
	 * @return
	 */
	@GetMapping(value="type1/foo/{companyId}/bar/{id}")
	public String pattern2(@PathVariable int companyId, @PathVariable int id) {
		logger.debug("★★★companyId：" + companyId + "★★★");
		logger.debug("★★★id：" + id + "★★★\n");
		return "type01/first";
	}
	
	/**
	 * クエリパラメータ取得その１
	 * @param id
	 * @param name
	 * @return
	 */
	@GetMapping(value="type1/foo/param", params= {"id", "name"})
	public String pattern3(@RequestParam int id, @RequestParam String name) {
		logger.debug("★★★id：" + id + "★★★");
		logger.debug("★★★name：" + name + "★★★\n");
		return "type01/first";
	}
	
	/**
	 * クエリパラメータ取得その２（クエリパラメータをオブジェクトにバインドする）
	 * Springが自動でクエリパラメータをオブジェクトにバインドしてくれる
	 * @param id
	 * @param name
	 * @return
	 */
	@GetMapping(value="type1/foo/bar/param")
	public String pattern4(Type1Form form) {
		logger.debug("★★★id：" + form.getId() + "★★★");
		logger.debug("★★★name：" + form.getName() + "★★★\n");
		return "type01/first";
	}
	
}
