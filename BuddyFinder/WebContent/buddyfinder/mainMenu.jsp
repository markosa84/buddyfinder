<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Főképernyő</title>
</head>
<body>
	<div style="text-align: right;">
		Üdvözöllek ${sessionScope.loggedInUser.userName}!
		<form action="${pageContext.request.contextPath}/logout" method="post">
			<input type="submit" value="Kijelentkezés"> 
		</form>
	</div>
</body>
</html>