package com.example.prototype.web.controller.type5;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type5.Type5Form;

/**
 * 入力チェックの基本
 * 
 */
@Controller
public class Type5Controller {
	
	/**
	 * フォームの設定 '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は Type5Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("type5Form")
	public Type5Form setUpForm() {
		return new Type5Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type5/")
	public String showFirst(Model model) {
		
		return "type5/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type5/", params = "send")
	public String send(@Valid @ModelAttribute("type5Form") Type5Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type5/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type5/"; 
	}
}
