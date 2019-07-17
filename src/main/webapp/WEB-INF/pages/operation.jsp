<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>填加/删除学生信息</title>
</head>
<body>
<form action="saveStudent" method="post">
姓名<input type="text" name="name"/><br/>
学号<input type="text" name="id"/><br/>
学校<input type="text" name="school"/><br/>
<input type="submit" value="保存"/><br/>
</form>
<form action="deleteStudent" method="post">
姓名<input type="text" name="name"/><br/>
学号<input type="text" name="id"/><br/>
<input type="submit" value="删除"/><br/>
</form>
</body>
</html>