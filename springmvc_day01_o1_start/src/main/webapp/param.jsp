<%--
  Created by IntelliJ IDEA.
  User: duanxiangqing
  Date: 2020/11/30
  Time: 9:35 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--这是超链接的形式--%>
<%--    <a href="param/testParam?username=haha&password=123456">请求参数绑定</a>--%>
<form action="param/saveAccount" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    用户姓名：<input type="text" name="user.uname"/><br/>
    用户年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交"/>
</form>


</body>
</html>
