<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>HandlerExceptionResolverを使用した例外ハンドリング方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">HandlerExceptionResolverを使用した例外ハンドリング方法</h2>
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
						<a href="<c:url value='/type12/error1'/>">サーバー側でNullPointerException</a>
					</td>
					<td>GlobalExceptionHandlerで例外ハンドリングを行う。</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value='/type12/error2'/>">サーバー側でNumberFormatException</a>
					</td>
					<td>GlobalExceptionHandlerにて親クラスであるIllegalArgumentExceptionをハンドリングしている。</td>
				</tr>
			</tbody>
		</table>

		<div class="form-group text-center">
			<a href="<c:url value="/"/>" class="btn btn-danger mr-4 px-5">戻る</a>
		</div>
	</div>
</body>
</html>