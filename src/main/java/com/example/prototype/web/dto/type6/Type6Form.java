package com.example.prototype.web.dto.type6;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * さまざまな入力チェック
 * 
 */
@Data
public class Type6Form {
	/** 名前 */
	@NotBlank // 文字列がnullまたは空文字、あるいは空白スペースのみでないこと。
	private String name;
	/** 年齢 */
	@Range(min = 1,max = 100) // 数値が指定した範囲であること。
	private Integer age;
	/** パスワード */
	@NotNull // nullでないこと。
	@Pattern(regexp = "^[a-zA-Z0-9]+$") // 正規表現に一致すること。
	private String password;
	/** 生年月日 */
	@Past // 過去日であること
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
}
