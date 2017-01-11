<%--
  Created by IntelliJ IDEA.
  User: jasonskipper
  Date: 1/11/17
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Cool</title>
  </head>
  <body>
  This is a JSP
  <a href="/hello">Click Here To Find The Current Time</a>
  <form action="/hello" method="post">
    <table>
      <tr><td>First Name:</td><td><input type="text" name="firstName"></td></tr>
      <tr><td>Last Name:</td><td><input type="text" name="lastName"></td></tr>
      <tr><td>Age:</td><td><input type="text" name="age"></td></tr>
    </table>
    <p>
      <input type="submit">
    </p>
  </form>
  </body>
</html>
