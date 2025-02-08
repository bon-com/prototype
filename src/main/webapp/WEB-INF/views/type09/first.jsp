<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>相関チェックを使いまわす方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">相関チェックを使いまわす方法</h2>
		<form:form modelAttribute="form" class="mt-4">
			<table class="table table-bordered">
				<tr>
					<th class="col-3">パスワード</th>
					<td class="col-7">
						<form:password path="password" cssClass="form-control" />
						<form:errors path="password" cssClass="text-danger" />
					</td>
				</tr>
				<tr>
					<th class="col-3">パスワード（確認用）</th>
					<td class="col-7">
						<form:password path="confirmPassword" cssClass="form-control" />
						<form:errors path="confirmPassword" cssClass="text-danger" />
					</td>
				</tr>
				<tr>
					<th class="col-3">メールアドレス</th>
					<td class="col-7">
						<form:input path="email" cssClass="form-control" />
						<form:errors path="email" cssClass="text-danger" />
					</td>
				</tr>
				<tr>
					<th class="col-3">メールアドレス（確認用）</th>
					<td class="col-7">
						<form:input path="confirmEmail" cssClass="form-control" />
						<form:errors path="confirmEmail" cssClass="text-danger" />
					</td>
				</tr>
			</table>

			<div class="form-group text-center mt-4">
				<a href="<c:url value="/"/>" class="btn btn-danger mr-4 px-5">戻る</a>
				<button type="submit" name="send" class="btn btn-primary px-5">送信</button>
			</div>
		</form:form>
	</div>
</body>
</html>