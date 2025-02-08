<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>POSTリクエスト方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">POSTリクエスト方法</h2>
		<form:form modelAttribute="type2Form" action="/prototype/type2/" class="mt-4">
			<table class="table table-bordered">
				<tr>
					<th class="col-3">名前</th>
					<td class="col-7">
						<form:input path="name" cssClass="form-control" />
					</td>
				</tr>
				<tr>
					<th class="col-3">数値</th>
					<td class="col-7">
						<form:input type="number" path="child.num" cssClass="form-control" />
					</td>
				</tr>
			</table>
			<div class="form-group text-center">
				<a href="<c:url value="/"/>" class="btn btn-danger mr-4 px-5">戻る</a>
				<button type="submit" name="send" class="btn btn-primary px-5">送信</button>
			</div>
		</form:form>
	</div>
</body>
</html>