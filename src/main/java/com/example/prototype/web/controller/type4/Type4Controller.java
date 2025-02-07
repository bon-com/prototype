package com.example.prototype.web.controller.type4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.biz.common.utils.PropertyUtils;
import com.example.prototype.web.dto.type4.Type4Form;

/**
 * 都道府県プロパティファイルからの取得
 * 
 */
@Controller
public class Type4Controller {
	
	/** ロガー */
	private static final Logger logger = LoggerFactory.getLogger(Type4Controller.class);
	
	/**
	 * フォームの設定 '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は Type4Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("type4Form")
	public Type4Form setUpForm(Model model) {
		// 都道府県マップを設定
		model.addAttribute("prefs", PropertyUtils.getPrefs());
		return new Type4Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type4/")
	public String showFirst() {
		return "type4/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type4/", params = "send")
	public String send(@ModelAttribute("type4Form") Type4Form form) {
		// フォームを使ってあれこれ
		logger.debug(PropertyUtils.getPrefs().get(form.getPrefecture()));
		
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type4/"; 
	}
}
