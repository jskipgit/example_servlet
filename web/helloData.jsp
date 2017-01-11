<%@ page import="com.ironyard.data.Person" %><%--
  Created by IntelliJ IDEA.
  User: jasonskipper
  Date: 1/11/17
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data</title>
</head>
<body>
Hello Data!
<%
    Person p = (Person)request.getAttribute("person");
%>
Hello <%=p.getFirstName()%> <%=p.getLastName()%> you are <%=p.getAge()%> years old!
</body>
</html>
