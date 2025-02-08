<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="UTF-8">
<%@ include file="/WEB-INF/common/header_common.jsp"%>
<title>POSTリクエスト方法（いろいろなフォーム部品）</title>
</head>
<body>
	<div class="container mt-5">
		<h2 class="text-center">POSTリクエスト方法（いろいろなフォーム部品）</h2>
		<form:form modelAttribute="type3Form" class="mt-4" enctype="multipart/form-data">
			<table class="table table-bordered">
				<!-- テキストフィールド -->
				<tr>
					<th class="col-3">名前</th>
					<td class="col-7">
						<form:input path="name" cssClass="form-control" />
					</td>
				</tr>
				<!-- 数値フィールド -->
				<tr>
					<th class="col-3">年齢</th>
					<td class="col-7">
						<form:input path="age" type="number" cssClass="form-control" />
					</td>
				</tr>
				<!-- パスワードフィールド -->
				<tr>
					<th class="col-3">パスワード</th>
					<td class="col-7">
						<form:password path="password" cssClass="form-control" />
					</td>
				</tr>
				<!-- 日付フィールド -->
				<tr>
					<th class="col-3">生年月日</th>
					<td class="col-7">
						<form:input type="date" path="birthday" cssClass="form-control" />
					</td>
				</tr>
				<!-- テキストエリア -->
				<tr>
					<th class="col-3">備考</th>
					<td class="col-7">
						<form:textarea path="bikou" cssClass="form-control" rows="5" />
					</td>
				</tr>
				<!-- チェックボックス -->
				<tr>
					<th class="col-3">同意確認</th>
					<td class="col-7">
						<div class="form-check">
							<form:checkbox path="isAccept" cssClass="form-check-input" value="1" label="同意する" />
						</div>
					</td>
				</tr>
				<!-- チェックボックス（複数） -->
				<tr>
					<th class="col-3">認証者確認</th>
					<td class="col-7">
						<div class="form-group">
							<div class="form-check">
								<form:checkbox path="roles" cssClass="form-check-input" value="1" />
								<label class="form-check-label" for="roles1">利用者</label>
							</div>
							<div class="form-check">
								<form:checkbox path="roles" cssClass="form-check-input" value="2" />
								<label class="form-check-label" for="roles2">管理者</label>
							</div>
							<div class="form-check">
								<form:checkbox path="roles" cssClass="form-check-input" value="3" />
								<label class="form-check-label" for="roles3">承認者</label>
							</div>
						</div>
					</td>
				</tr>
				<!-- ラジオボタン -->
				<tr>
					<th class="col-3">性別</th>
					<td class="col-7">
						<div class="form-check">
							<form:radiobutton path="gender" value="1" cssClass="form-check-input" label="男性" />
						</div>
						<div class="form-check">
							<form:radiobutton path="gender" value="2" cssClass="form-check-input" label="女性" />
						</div>
					</td>
				</tr>
				<!-- セレクトボックス -->
				<tr>
					<th class="col-3">趣味</th>
					<td class="col-7">
						<div class="form-group">
							<form:select path="hobby" cssClass="form-control" items="${hobbies}" />
						</div>
					</td>
				</tr>
				<!-- ファイル参照 -->
				<tr>
					<th class="col-3">ファイル</th>
					<td class="col-7">
						<input type="file" name="file" />
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