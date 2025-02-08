# prototypeアプリ
さまざまWebアプリ作成用のスニペットを保存する  

### ◆SpringMVCメモ
* DIコンテナが2種類ある
* Webアプリケーションコンテキスト（springMVCContext.xml）はプレゼンテーション層のDIコンテナ
* ルートアプリケーションコンテキスト（applicationContext.xml）はサービス層以降のDIコンテナ  
* ContextLoaderListenerクラスがサーバー起動時につくられる　※web.xml管理  
applicationContext.xml（ルートアプリケーションコンテキスト用Bean定義ファイル）を参照し、そこに定義されているBean（サービス、リポジトリ層）を初期化して管理する  
* DispatcherServletクラスがサーバー起動時につくられる　※web.xml管理  
springMVCContext.xml（Webアプリケーションコンテキスト用Bean定義ファイル）を参照し、そこに定義されているBean（コントローラー層など）を初期化して管理する  
* @AutowiredなどでDIするとき、ContextLoaderListenerまたはDispatcherServletからDIされる  
ContextLoaderListenerが親、DispatcherServletは子という関係  
子から親は参照可能だが、親から子を参照できない  

### ◆インデックス
 - type1：SpringMVCのGETリクエストを取得
 - type2：基本的なPOSTリクエストの取得
 - type3：様々なフォーム部品をPOSTリクエストで取得
 - type4：プロパティから都道府県情報を取得
 - type5：入力チェックの基本
 - type6：さまざまな入力チェック（Bean Validation）
 - type7：入力チェック独自ルール追加（Bean Validation）

## ◆補足説明

### ◇type4：  
prefectures.properties の中身がバインドされる。  
以下の手順で使用する。  
1. prefectures.propertiesをクラスパス上に作成    
2. PropertySourcesPlaceholderConfigurerをBean定義し、prefectures.propertiesを指定する。  
上記Beanはどの層からでも参照できるよう、ルートアプリケーションコンテキスト配下に用意した。  
3. @Valueアノテーションを使用し、プロパティファイル名を指定することで、プロパティの中身が対象の変数にバインドされる。  


### ◇type5：  
以下の手順で入力チェックを行うための資材を準備する。
1. Hibernate Validatorをpom.xmlに追加する。  
2. メッセージプロパティファイルを用意（※デフォルトでHibernate Validatorは、クラスパスに置かれたValidationMessages.propertiesを参照する）  
3. CommonControllerAdviceクラスを用意し、空文字はNULLへと変換する。（※具体的にはクラスコメントを参照）

### ◇type6：  
messageSourceをDIすることで、メッセージプロパティに汎用的なメッセージ用プレースホルダ（{0}など）を使用できる  
デフォルトの状態だとメッセージ定義しづらい

### ◇type7：  
Alphanumericに独自アノテーションルールを追加
