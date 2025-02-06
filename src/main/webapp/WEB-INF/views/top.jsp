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
		<h2 class="text-center">スニペットまとめ</h2>
		<p>
			<a href="<c:url value='/type1/'/>">さまざまなGETリクエスト方法</a>
		</p>
		<p>
			<a href="<c:url value='/type2/'/>">基本的なPOSTリクエスト方法</a>
		</p>
		<p>
			<a href="<c:url value='/type3/'/>">基本的なPOSTリクエスト方法（いろいろなフォーム部品）</a>
		</p>
	</div>
</body>
</html>