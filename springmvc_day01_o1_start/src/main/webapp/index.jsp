<%--
  Created by IntelliJ IDEA.
  User: duanxiangqing
  Date: 2020/11/29
  Time: 9:24 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>入门程序</h3>
<%--    超链接路径是hello--%>
    <a href="user/hello">入门程序</a>

<%--    这个是用来换行的--%>
    <br>


<%--     <h3>测试RequestMapping注解</h3>--%>
<%--    href是属性名即路径中的字符串，尖号之间是页面上显示的东西--%>
<%--    控制器HelloController类中嵌套了@RequestMapping注解，所以href要加分隔符--%>
    <a href="user/testRequestMapping?username=hehe">测试RequestMapping注解</a>
    <br>

<a href="user/testServlet">Servlet原生的API</a>

</body>
</html>
