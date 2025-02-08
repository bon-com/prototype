package com.example.prototype.web.controller.type8;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type8.Type8Form;

/**
 * 相関チェック独自ルール追加
 * 
 */
@Controller
public class Type8Controller {
	
	/**
	 * フォームの設定
	 * '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は type8Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type8Form setUpForm() {
		return new Type8Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type8/")
	public String showFirst() {
		return "type8/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type8/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type8Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type8/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type8/"; 
	}
}
