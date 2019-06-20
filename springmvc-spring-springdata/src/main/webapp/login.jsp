<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>登录页面</h3>
<span style="color: red">${errorMsg}</span>
<form action="${pageContext.request.contextPath}/user/login.do" method="post">
	姓名：<input name="name"><br>
	密码：<input type="password" name="password"><br>
	<button type="submit">登录</button>
</form>
</body>
</html>