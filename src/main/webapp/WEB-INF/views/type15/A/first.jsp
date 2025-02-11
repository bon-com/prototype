<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>HttpSessionを使用したセッション管理方法</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">HttpSessionを使用したセッション管理方法</h2>
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
			</table>

			<div class="form-group text-center">
				<a href="<c:url value="/type15A/back"/>" class="btn btn-danger mr-4 px-5">戻る</a>
				<button type="submit" name="send" class="btn btn-primary px-5">送信</button>
			</div>
		</form:form>
	</div>
</body>
</html>