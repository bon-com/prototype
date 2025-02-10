package com.example.prototype.web.controller.type13;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.prototype.web.dto.type13.Type13Form;

/**
 * '@SessionAttributesを使用したセッション管理方法
 * 
 */
@Controller
@SessionAttributes("form") // "form" オブジェクトをセッションに保存
public class Type13Controller {
	
	/**
	 * フォームの設定
	 * コントローラーに@SessionAttributesを付与
	 * このメソッドに@ModelAttributeを付与することで、初回リクエストのみモデルに格納される。
	 * これ以降、セッションのモデルが使用される。
	 * 
	 * @return
	 */
	@ModelAttribute("form")
	public Type13Form setUpForm() {
		return new Type13Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type13/")
	public String showFirst(Model model) {
		
		return "type13/first";
	}

	/**
	 * 送信フォームの取得
	 * @param form
	 * @return
	 */
	@PostMapping(value = "type13/", params = "send")
	public String send(@Valid @ModelAttribute("form") Type13Form form, BindingResult rs) {
		// 入力チェック
		if (rs.hasErrors()) {
			// 入力エラー
			return "type13/first";
		}
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type13/confirm"; 
	}
	
	/**
	 * 確認画面表示
	 * @return
	 */
	@GetMapping(value = "type13/confirm")
	public String confirm() {
		return "type13/second";
	}
	
	/**
	 * セッション破棄してTOP画面表示
	 * @return
	 */
	@GetMapping(value = "type13/back")
	public String back(SessionStatus status) {
        // @SessionAttributes によって管理されている すべてのオブジェクトをセッションから削除
        status.setComplete();
        
		return "redirect:/";
	}
	
	// セッションを個別に削除できない模様
//	/**
//	 * セッション破棄してTOP画面表示
//	 * @return
//	 */
//	@GetMapping(value = "type13/top")
//	public String backTop(HttpSession session) {
//        // セッションからformオブジェクトのみ削除
//		session.removeAttribute("form");
//        
//		return "redirect:/";
//	}
}
