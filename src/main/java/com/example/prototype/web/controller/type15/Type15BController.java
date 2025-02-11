package com.example.prototype.web.controller.type15;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HttpSessionを使用したセッション管理方法
 * 
 */
@Controller
public class Type15BController {
	
	/**
	 * 確認画面表示
	 * @return
	 */
	@GetMapping(value = "type15B/confirm")
	public String confirm(Model model, HttpSession session) {
		// セッションから名前を取得
		model.addAttribute("name", session.getAttribute("name"));
		
		return "type15/B/second";
	}
	
	/**
	 * セッション破棄してTOP画面表示
	 * @return
	 */
	@GetMapping(value = "type15B/back")
	public String back(HttpSession session) {
		// すべてのセッション削除
		session.invalidate(); 
        
		return "redirect:/";
	}
}
