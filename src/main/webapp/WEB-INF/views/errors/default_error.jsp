<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>デフォルトエラー</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">デフォルトエラー</h2>
		<div class="container mt-5">
			<div class="alert alert-danger" role="alert">エラー内容: 特定のHTTPステータスのエラーハンドリングを行なっていない場合、このデフォルトエラーが表示される。</div>
		</div>
		<table class="table table-bordered">
			<tr>
				<th class="col-3">ステータスコード</th>
				<td class="col-7"><%=response.getStatus()%></td>
			</tr>
		</table>
		<div class="d-flex justify-content-center mt-2">
			<a href="<c:url value='/' />">トップへ</a>
		</div>
	</div>
</body>
</html>
