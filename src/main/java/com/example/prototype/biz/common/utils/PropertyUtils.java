package com.example.prototype.biz.common.utils;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyUtils {
	
	/**
	 * 都道府県情報
	 * prefectures.propertiesの中身がバインドされる。
	 * 以下の手順で使用する。
	 * ①prefectures.propertiesをクラスパス上に作成
	 * ②PropertySourcesPlaceholderConfigurerをBean定義し、prefectures.propertiesを指定する。
	 * 　上記Beanはどの層からでも参照できるよう、ルートアプリケーションコンテキスト配下に用意した。
	 * ③@Valueアノテーションを使用し、プロパティファイル名を指定することで、プロパティの中身が対象の変数にバインドされる。
	 * 
	 */
	@Value("${prefectures}")
	private String prefecturesString;
	
	/** 都道府県マップ（都道府県キーと値のペア） */
	private static Map<String, String> prefMap = new LinkedHashMap<>();
	
	/** 趣味マップ */
	private static Map<String, String> hobbyMap = new LinkedHashMap<>();
	
	static {
		// 初期化
		hobbyMap.put("", "選択してください");
		hobbyMap.put("1", "映画鑑賞");
		hobbyMap.put("2", "読書");
		hobbyMap.put("3", "ハイキング");
	}
	
	/**
	 * 初期化処理
	 * ＠PostConstructは、Beanの初期化や対象のオブジェクトのDIが完了した後、オブジェクトが使用される前に一度だけ呼ばれる。
	 * 使用するには、「javax.annotation-api」を依存関係に追加する必要あり。
	 * 
	 */
	@PostConstruct
	public void init() {
		// 都道府県マップ作成
		prefMap.put("", "選択してください");
		Arrays.stream(prefecturesString.split(",")).forEach(str -> {
			String[] strArr = str.split(":");
			prefMap.put(strArr[0], strArr[1]);
		});
	}

	/**
	 * 都道府県情報（マップ）を返却する
	 * @return
	 */
	public static Map<String, String> getPrefs () {
		return prefMap;
	}
	
	/**
	 * 趣味情報（マップ）を返却する
	 * @return
	 */
	public static Map<String, String> getHobbies () {
		return hobbyMap;
	}

}
