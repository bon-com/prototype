<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>さまざまな入力チェック</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">さまざまな入力チェック</h2>
		<form:form modelAttribute="form" class="mt-4">
			<table class="table table-bordered">
				<!-- テキストフィールド -->
				<tr>
					<th class="col-3">名前</th>
					<td class="col-7">
						<form:input path="name" cssClass="form-control" />
						<form:errors path="name" cssClass="text-danger" />
					</td>
				</tr>
				<!-- 数値フィールド -->
				<tr>
					<th class="col-3">年齢</th>
					<td class="col-7">
						<form:input path="age" type="number" cssClass="form-control" />
						<form:errors path="age" cssClass="text-danger" />
					</td>
				</tr>
				<!-- パスワードフィールド -->
				<tr>
					<th class="col-3">パスワード</th>
					<td class="col-7">
						<form:password path="password" cssClass="form-control" />
						<form:errors path="password" cssClass="text-danger" />
					</td>
				</tr>
				<!-- 日付フィールド -->
				<tr>
					<th class="col-3">生年月日</th>
					<td class="col-7">
						<form:input type="date" path="birthday" cssClass="form-control" />
						<form:errors path="birthday" cssClass="text-danger" />
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