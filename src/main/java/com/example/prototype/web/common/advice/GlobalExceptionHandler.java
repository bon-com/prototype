package com.example.prototype.web.common.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全てのコントローラーで発生する例外を共通で処理するクラス
 * '@ExceptionHandlerアノテーションを付与したメソッドを定義することで
 * コントローラーからスローされた例外をハンドリングできる
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * NullPointerExceptionとIllegalArgumentExceptionとサブクラスをハンドリングする
	 * @param e
	 * @return
	 */
	@ExceptionHandler({NullPointerException.class, IllegalArgumentException.class})
	public String handleDataNotFoundException(RuntimeException e) {
		return "errors/app_error";
	}
}
