<%@ page import="com.example.week1.models.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: quoclap
  Date: 16/09/2024
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html>
<head>
  <title>Product List</title>
  <style>
    table {
      width: 100%;
      border-collapse: collapse;
    }
    th, td {
      border: 1px solid #ddd;
      padding: 8px;
    }
    th {
      background-color: #f2f2f2;
    }
  </style>
</head>
<body>
<h1>Product List</h1>
<table>
  <thead>
  <tr>
    <th>Name</th>
    <th>Factory</th>
    <th>Price</th>
  </tr>
  </thead>
  <tbody>
  <%
    List<Product> productList = (List<Product>) request.getAttribute("productList");
    if (productList != null && !productList.isEmpty()) {
      for (Product product : productList) {
  %>
  <tr>
    <td><%= product.getName() %></td>
    <td><%= product.getFactory() %></td>
    <td><%= product.getPrice() %></td>
  </tr>
  <%
    }
  } else {
  %>
  <tr>
    <td colspan="3">No products found</td>
  </tr>
  <%
    }
  %>
  </tbody>
</table>
</body>
</html>