<%--
  Created by IntelliJ IDEA.
  User: guc
  Date: 2020/1/14
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>欢迎页</title>
</head>
<body>
<h2> Hello World</h2>
<%--requestScope:表示变量的作用域，一共4种。pageScope: 表示变量只能在本页面使用。requestScope:表示变量能在本次请求中使用。sessionScope:表示变量能在本次会话中使用。applicationScope:表示变量能在整个应用程序中使用--%>
${requestScope.message}

<h2>Spring MVC页面重定向</h2>
<p>点击下面的按钮将结果重定向到新页面</p>
<form:form method="GET" action="redirect">
    <table>
        <tr>
            <td><input type="submit" value="页面重定向" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
