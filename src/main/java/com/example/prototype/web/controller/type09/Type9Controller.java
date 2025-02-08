package com.example.prototype.web.controller.type09;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type09.Type9Form;

/**
 * 相関チェックを使いまわす方法
 * 
 */
@Controller
public class Type9Controller {
	
	/**
	 * フォームの設定
	 * '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は type9Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type9Form setUpForm() {
		return new Type9Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type9/")
	public String showFirst() {
		return "type09/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type9/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type9Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type09/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type9/"; 
	}
}
