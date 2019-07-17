<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
<h3>所有学生信息</h3>
<c:forEach items="${students}" var="student">
	${student.name}-${student.id}-${student.school}
	<br>
</c:forEach>
</body>
</html>