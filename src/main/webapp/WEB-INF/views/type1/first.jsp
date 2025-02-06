<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>さまざまなGETリクエスト方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">さまざまなGETリクエスト方法</h2>
		<p>
			<a href="<c:url value='/type1/foo/1'/>">GETリクエストその１（パスパラメータ）</a>
		</p>
		<p>
			<a href="<c:url value='/type1/foo/2/bar/3'/>">GETリクエストその２（パスパラメータ）</a>
		</p>
		<p>
			<a href="<c:url value='/type1/foo/param?id=5&name=abc'/>">GETリクエストその３（クエリパラメータ）</a>
		</p>
	</div>
</body>
</html>