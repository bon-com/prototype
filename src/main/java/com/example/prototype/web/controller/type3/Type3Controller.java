package com.example.prototype.web.controller.type3;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.prototype.web.dto.type3.Type3Form;

/**
 * 基本的なPOSTリクエスト方法（いろいろなフォーム部品）
 * 
 */
@Controller
public class Type3Controller {

	/**
	 * フォームの設定 '@ModelAttributeアノテーションを付けたメソッドを用意することで、
	 * ハンドラメソッドが実行される前にリクエストスコープにフォームオブジェクト（今回は Type3Form）が自動的に格納される。
	 * 
	 * @return
	 */
	@ModelAttribute("type3Form")
	public Type3Form setUpForm() {
		return new Type3Form();
	}

	/**
	 * 初期画面表示
	 * 
	 * @return
	 */
	@GetMapping(value = "type3/")
	public String showFirst(Model model) {
		var hobbies = new HashMap<String, String>();
		hobbies.put("", "選択してください");
		hobbies.put("1", "映画鑑賞");
		hobbies.put("2", "読書");
		hobbies.put("3", "ハイキング");
		model.addAttribute("hobbies", hobbies);
		
		return "type3/first";
	}

	@PostMapping(value = "type3/", params = "send")
	public String send(@ModelAttribute("type3Form") Type3Form form) {
		// フォームを使ってあれこれ
		// 画面側のフォームの中身をクリアするため、一旦リダイレクト
		return "redirect:/type3/"; 
	}
}
