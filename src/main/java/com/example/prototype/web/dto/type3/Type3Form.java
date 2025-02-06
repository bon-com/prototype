package com.example.prototype.web.dto.type3;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * 基本的なPOSTリクエスト方法（いろいろなフォーム部品）
 * 
 */
@Data
public class Type3Form {
	/** 名前 */
	private String name;
	/** 年齢 */
	private Integer age;
	/** パスワード */
	private String password;
	/** 生年月日 */
	@DateTimeFormat(pattern = "yyyy-MM-dd") // クライアントから送られた"yyyy-MM-dd" 形式の文字列を、自動でDate型に変換する
	private Date birthday;
	/** 備考 */
	private String bikou;
	/** 同意確認 */
	private String isAccept;
	/** 認証者確認 */
	private List<String> roles;
	/** 性別 */
	private String gender;
	/** 趣味 */
	private String hobby;
}
