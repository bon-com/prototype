package com.example.prototype.web.controller.type14;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.example.prototype.web.common.dto.GeneralUser;
import com.example.prototype.web.dto.type14.Type14AForm;

/**
 * '@SessionScopeを使用したセッション管理方法
 * 
 */
@Controller
public class Type14AController {
	
	/** セッションで管理するオブジェクト */
	@Autowired
	private GeneralUser user;
	
	/**
	 * フォームの設定
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type14AForm setUpForm() {
		return new Type14AForm();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type14A/")
	public String showFirst(Model model) {
		
		return "type14/A/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type14A/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type14AForm form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type14/A/first";
		}
		// セッションに格納
		user.setName(form.getName());
		
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type14B/confirm"; 
	}

	/**
	 * セッション破棄してTOP画面表示
	 * @return
	 */
	@GetMapping(value = "type14A/back")
	public String back(SessionStatus status) {
        // @SessionAttributes によって管理されている すべてのオブジェクトをセッションから削除
        status.setComplete();
        
		return "redirect:/";
	}
	
}
