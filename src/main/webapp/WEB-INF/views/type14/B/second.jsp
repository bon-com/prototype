<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>@SessionScopeを使用したセッション管理方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">@SessionScopeを使用したセッション管理方法</h2>
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
						名前
					</td>
					<td><c:out value="${name}" /></td>
				</tr>
			</tbody>
		</table>

		<div class="form-group text-center">
			<a href="<c:url value="/type14A/"/>" class="btn btn-danger mr-4 px-5">戻る</a>
			<a href="<c:url value="/type14B/back"/>" class="btn btn-success mr-4 px-5">TOPへ</a>
		</div>
	</div>
</body>
</html>