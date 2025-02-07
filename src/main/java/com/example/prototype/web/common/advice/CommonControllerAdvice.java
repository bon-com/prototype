package com.example.prototype.web.common.advice;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@Component
@ControllerAdvice("com.example.prototype.web.controller") 
public class CommonControllerAdvice {
	
	/**
	 * フォームデータバインディング設定
	 * InitBinderアノテーションは、指定したコントローラーパッケージ配下のハンドラメソッドが実行される前に処理する。
	 * StringTrimmerEditorは文字列の前後にある不要な空白（スペース、タブ、改行など）を自動的にトリミングする。
	 * また、コンストラクタにtrueを設定することで、トリミング後に空文字だった場合NULLに変換する。
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
}
