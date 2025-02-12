<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>GETリクエスト方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">GETリクエスト方法</h2>
		<p>
			<a href="<c:url value='/type1/foo/1'/>">GETリクエストその１（パスパラメータ）</a>
		</p>
		<p>
			<a href="<c:url value='/type1/foo/2/bar/3'/>">GETリクエストその２（パスパラメータ）</a>
		</p>
		<p>
			<a href="<c:url value='/type1/foo/param?id=5&name=abc'/>">GETリクエストその３（クエリパラメータ）</a>
		</p>
		<p>
			<a href="<c:url value='/type1/foo/bar/param?id=5&name=abc'/>">GETリクエストその４（クエリパラメータをオブジェクトで取得）</a>
		</p>

		<div class="form-group text-center">
			<a href="<c:url value="/"/>" class="btn btn-danger mr-4 px-5">戻る</a>
		</div>
	</div>
</body>
</html>