package com.example.prototype.web.controller.type15;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type15.Type15AForm;

/**
 * HttpSessionを使用したセッション管理方法
 * 
 */
@Controller
public class Type15AController {
	
	/**
	 * フォームの設定
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type15AForm setUpForm() {
		return new Type15AForm();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type15A/")
	public String showFirst(Model model) {
		return "type15/A/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type15A/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type15AForm form, BindingResult rs, HttpSession session) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type15/A/first";
		}
		
		// セッションに格納
		session.setAttribute("name", form.getName());
		
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type15B/confirm"; 
	}

	/**
	 * セッション破棄してTOP画面表示
	 * @return
	 */
	@GetMapping(value = "type15A/back")
	public String back(HttpSession session) {
		// セッションで管理しているnameを削除
		session.removeAttribute("name"); 
        
		return "redirect:/";
	}
	
}
