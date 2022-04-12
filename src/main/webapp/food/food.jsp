<%@ page import="java.util.List" %>
<%@ page import="com.enigma.wmbahari.model.Food" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 4/10/2022
  Time: 9:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>List of Food</h3>
<a href="food.jsp">Add Food</a>
<table>
    <thead>
    <th>Id</th>
    <th>Code</th>
    <th>Name</th>
    <th>Price</th>
    <th>Action</th>
    </thead>
    <tbody>
    <% List<Food> foodList = (List<Food>) request.getAttribute("foods"); %>
    <% for (Food food: foodList) { %>
    <tr>
        <td><%=food.getId()%></td>
        <td><%=food.getCode()%></td>
        <td><%=food.getName()%></td>
        <td><%=food.getPrice()%></td>
        <td>
            <a href="food_update.jsp"
        </td>
    </tr>
    </tbody>
</table>
</body>
</html>
