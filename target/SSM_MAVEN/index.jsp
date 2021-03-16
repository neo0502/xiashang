<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/FindAll">测试查询</a>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name">
        金额:<input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
