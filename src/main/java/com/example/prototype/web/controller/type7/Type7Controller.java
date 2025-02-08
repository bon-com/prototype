package com.example.prototype.web.controller.type7;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type7.Type7Form;

/**
 * 入力チェック独自ルール追加
 * 
 */
@Controller
public class Type7Controller {
	
	/**
	 * フォームの設定
	 * '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は Type7Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type7Form setUpForm() {
		return new Type7Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type7/")
	public String showFirst() {
		return "type07/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type7/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type7Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type07/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type7/"; 
	}
}
