package com.example.prototype.web.controller.type14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.support.SessionStatus;

import com.example.prototype.web.common.dto.GeneralUser;

/**
 * '@SessionScopeを使用したセッション管理方法
 * 
 */
@Controller
public class Type14BController {
	
	/** セッションで管理するオブジェクト */
	@Autowired
	private GeneralUser user;
	
	/**
	 * 確認画面表示
	 * @return
	 */
	@GetMapping(value = "type14B/confirm")
	public String confirm(Model model) {
		// セッションから名前を取得
		model.addAttribute("name", user.getName());
		
		return "type14/B/second";
	}
	
	/**
	 * セッション破棄してTOP画面表示
	 * @return
	 */
	@GetMapping(value = "type14B/back")
	public String back(SessionStatus status) {
        // @SessionAttributes によって管理されている すべてのオブジェクトをセッションから削除
        status.setComplete();
        
		return "redirect:/";
	}
}
