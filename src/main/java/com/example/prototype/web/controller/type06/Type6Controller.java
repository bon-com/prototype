package com.example.prototype.web.controller.type06;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.biz.common.utils.PropertyUtils;
import com.example.prototype.web.dto.type06.Type6Form;

/**
 * さまざまな入力チェック
 * 
 */
@Controller
public class Type6Controller {
	
	/**
	 * フォームの設定
	 * '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は Type6Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type6Form setUpForm(Model model) {
		// 趣味マップを設定
		model.addAttribute("hobbies", PropertyUtils.getHobbies());
		return new Type6Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type6/")
	public String showFirst() {
		return "type06/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type6/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type6Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type06/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type6/"; 
	}
}
