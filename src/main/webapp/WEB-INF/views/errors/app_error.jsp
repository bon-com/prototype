<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>アプリケーションエラー</title>
</head>
<body>
	<%@ page isErrorPage="true"%>
	<div class="container mt-5">
		<h2 class="text-center">アプリケーションエラー</h2>
		<div class="container mt-5">
			<div class="alert alert-danger" role="alert">
				エラー内容: アプリケーション側で例外ハンドリング
			</div>
			<table class="table table-bordered">
				<tr>
					<th class="col-3">ステータスコード</th>
					<td class="col-7"><%=response.getStatus()%></td>
				</tr>
				<tr>
					<th class="col-3">例外オブジェクト</th>
					<td class="col-7"><%=exception%></td>
				</tr>
				<tr>
					<th class="col-3">例外メッセージ</th>
					<td class="col-7"><%=exception.getMessage()%></td>
				</tr>
			</table>
		</div>
		<div class="d-flex justify-content-center mt-2">
			<a href="<c:url value='/' />">トップへ</a>
		</div>
	</div>
</body>
</html>
