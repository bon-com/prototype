package com.example.prototype.web.controller.type2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type2.Type2Form;

/**
 * POSTリクエスト方法
 * 
 */
@Controller
public class Type2Controller {
	
	/** ロガー */
	private static final Logger logger = LoggerFactory.getLogger(Type2Controller.class);
	
	/**
	 * フォームの設定
	 * '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は Type2Form）が自動的に格納される。
	 * @return
	 */
	@ModelAttribute("type2Form")
	public Type2Form setUpForm() {
		return new Type2Form();
	}
	
	/**
	 * 初期画面表示
	 * @return
	 */
	@GetMapping(value = "type2/")
	public String showFirst() {
		return "type2/first";
	}
	
	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value="type2/", params="send")
	public String send(@ModelAttribute("type2Form") Type2Form form) {
		logger.debug("★★★form.name：" + form.getName() + "★★★");
		logger.debug("★★★form.child.num：" + form.getChild().getNum() + "★★★");
		return "type2/first";
	}
}
