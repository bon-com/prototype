<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>web.xmlを使用した例外ハンドリング方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">web.xmlを使用した例外ハンドリング方法</h2>
		<table class="table table-bordered mt-5">
			<thead class="table-primary"">
				<tr>
					<th>リンク</th>
					<th>説明</th>
				</tr>
			</thead>
			<tbody class="">
				<tr>
					<td>
						<a href="<c:url value='/type11/foo/1'/>">対象リクエストハンドラなし（フロントコントローラーで例外発生）</a>
					</td>
					<td>サーバー側でURLにマッピングするハンドラがなく、404エラーが発生するケース。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type11/dummy'/>">サーバー側で許可されないHTTPメソッド（フロントコントローラーで例外発生）</a>
					</td>
					<td>サーバー側でURLにマッピングするハンドラが存在するが、受け付けるHTTPメソッドが異なり405エラーが発生するケース。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type11/hoge'/>">対象JSPなし（JSP側で例外発生）</a>
					</td>
					<td>JSP側が正しく実装されておらず、JSP側で500エラーが発生するケース。</td>
				</tr>
			</tbody>
		</table>

		<div class="form-group text-center">
			<a href="<c:url value="/"/>" class="btn btn-danger mr-4 px-5">戻る</a>
		</div>
	</div>
</body>
</html>