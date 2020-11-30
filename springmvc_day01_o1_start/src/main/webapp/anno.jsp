<%--
  Created by IntelliJ IDEA.
  User: duanxiangqing
  Date: 2020/11/30
  Time: 9:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="anno/testRequestParam?name=haha">RequestParam</a>

<br>

<%--action里的路径最前面加了"/"代表从初始路径开始拼接（即拼接在端口号后面），不加则代表在当前路径后面接着拼接--%>
<%--<form action="/anno/testRequestBody" method="post">--%>
<form action="anno/testRequestBody" method="post">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交"/>
</form>

<a href="anno/testPathVariable/10">testPathVariable</a>
<br>
<a href="anno/testRequestHeader">RequestHeader</a>
<br>
<a href="anno/testCookieValue">RequestHeader</a>

</body>
</html>
