<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<style type="text/css">
		.row{
			display: block;
			width: 100%;
			float: left;
		}
		.text{
			width: 150px;
			float: left;
			text-align: right;
		}
		.show{
			float: left;
		}
		.input{
			width:250px
		}
	</style>
</head>
<body>
	<form action="gateway" method="post">
		<div style="margin: 30px 0;">
			<div class="row">
				<div class="text">接口名：</div>
				<div class="show"><input name="operationType" type="text" class="input"></div>
			</div>
			<div class="row">
				<div class="text">appId：</div>
				<div class="show"><input name="appId" type="text" class="input"></div>
			</div>
			
			<div class="row">
				<div class="text">sign：</div>
				<div class="show"><input name="sign" type="text" class="input"></div>
			</div>
			<div class="row" style="margin: 10px 0;">
				<div class="text">请求参数：</div>
				<div class="show"><textarea name="requestData" rows="15" cols="50"></textarea></div>
			</div>
			<div class="row" style="margin: 10px;">
				<div class="text"><button type="submit">提交</button></div>
			</div>
		</div>
	</form>
</body>
</html>
