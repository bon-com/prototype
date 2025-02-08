package com.example.prototype.web.controller.type10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.common.validation.PasswordMatchValidator;
import com.example.prototype.web.dto.type10.Type10Form;

/**
 * 順序をつけた相関チェックを行う方法
 * 
 */
@Controller
public class Type10Controller {
	@Autowired
	private PasswordMatchValidator passwordMatchValidator;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// カスタムバリデーションの登録
		binder.addValidators(passwordMatchValidator);
	}
	/**
	 * フォームの設定
	 * '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は type10Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type10Form setUpForm() {
		return new Type10Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type10/")
	public String showFirst() {
		return "type10/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type10/", params = "send")
	public String send(@Validated @ModelAttribute("form") Type10Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type10/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type10/"; 
	}
}
