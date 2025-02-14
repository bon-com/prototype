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
 - type8：相関チェック独自ルール追加（Bean Validation）
 - type9：相関チェックを使いまわす方法（Bean Validation）
 - type10：順序をつけた相関チェックを行う方法（Bean Validation）
 - type11：web.xmlを使用した例外ハンドリング方法
 - type12：HandlerExceptionResolverを使用した例外ハンドリング方法
 - type13：@SessionAttributesを使用したセッション管理方法
 - type14：@SessionScopeを使用したセッション管理方法
 - type15：HttpSessionを使用したセッション管理方法

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

### ◇type8：  
FieldsMatch、FieldsMatchValidatorに独自アノテーションを追加  
Type8Formに作成したアノテーションの設定方法を記載  
ValidationMessages.propertiesのパスワード（確認用）プロパティについて、記載方法に注意

### ◇type9：  
FieldsMatch、FieldsMatchListを使用して相関チェック用独自アノテーションを使いまわす

### ◇type10：  
BaseFormを継承したフォームクラスを使用する  
PasswordMatchValidatorを作成してorg.springframework.validationを実装したクラスを作成する

### ◇type11：  
フロントコントローラーやJSP側、サーブレットフィルターでエラーが発生する場合はweb.xmlで例外ハンドリングを行う

### ◇type12：  
アプリケーション内（コントローラー、サービス、DAO層など）で発生した例外をすべてハンドリングする  
すべてのリクエストはコントローラー経由となり、スローされる例外（大体はRuntime系）もコントローラーから呼び出しもとへスローされる  
すべてのコントローラーからスローされる例外を一律ハンドリングすることができる  

### ◇type13：  
@SessionAttributesを使用することで、単一コントローラー内でセッション管理を行なえる  
個別にセッションで管理しているオブジェクトを削除することはできないので注意  

### ◇type14：  
@SessionScopeを付与したオブジェクトをDIコンテナで管理することで、  
コントローラー間でのセッション管理が可能となる  
個別にセッションで管理しているオブジェクトを削除することはできないので注意  

### ◇type15：  
HttpSessionを使用することで、Springに依存しないセッション管理を行うことができる
個別にセッションで管理しているオブジェクトを削除することも可能

