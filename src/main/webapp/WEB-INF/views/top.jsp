<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>スニペットまとめ</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center mb-5">スニペットまとめ</h2>

		<table class="table table-bordered ">
			<thead class="table-primary"">
				<tr>
					<th>リンク</th>
					<th>説明</th>
				</tr>
			</thead>
			<tbody class="">
				<tr>
					<td>
						<a href="<c:url value='/type1/'/>">GETリクエスト方法</a>
					</td>
					<td>GETリクエストの受け取り方についてメモ。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type2/'/>">POSTリクエスト方法</a>
					</td>
					<td>POSTリクエストの受け取り方についてメモ。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type3/'/>">POSTリクエスト方法（いろいろなフォーム部品）</a>
					</td>
					<td>
						いろんなフォーム部品の疎通方法についてメモ。<br>テキストボックス、セレクトボックス、ファイルなど。
					</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type4/'/>">都道府県プロパティファイルからの取得</a>
					</td>
					<td>
						都道府県プロパティファイルから、中身を取得する方法についてメモ。<br> PropertyUtilsに詳細は記載。
					</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type5/'/>">入力チェックの基本</a>
					</td>
					<td>Beanバリデーションを行うための基本についてメモ。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type6/'/>">さまざまな入力チェック</a>
					</td>
					<td>BeanバリデーションやHibernateバリデーションが提供するアノテーションについてメモ。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type7/'/>">入力チェック独自ルール追加</a>
					</td>
					<td>Beanバリデーションに独自ルール（アノテーション）を追加する方法についてメモ。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type8/'/>">相関チェック独自ルール追加</a>
					</td>
					<td>Beanバリデーションに相関チェックルールを追加する方法についてメモ。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type9/'/>">相関チェックを使いまわす方法</a>
					</td>
					<td>作成した相関チェック独自ルールを複数回使用する場合は注意が必要。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type10/'/>">順序をつけた相関チェックを行う方法</a>
					</td>
					<td>単項目チェックを実施した後、問題なければ相関チェックを行う方法についてメモ。</td>
				</tr>
			</tbody>
		</table>
	</div>


</body>
</html>