<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ page isELIgnored="false" %>
<html>  
<head>  
<title></title>  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>  
<body>  
 <center>  
  <h3>List of Users availing our Social Network Services</h3>
  <table class="table table-striped" border="1">  
   <tr>  
       <td class="heading">Id</td>
    <td class="heading">First Name</td>  
    <td class="heading">Last Name</td>
        <td class="heading">Email</td>  
    <td class="heading">Mobile</td>  
   </tr>  
   <c:forEach var="user" items="${userList}">  
    <tr>
    <td>${user.userId}</td>     
     <td>${user.firstName}</td>  
     <td>${user.lastName}</td>  
          <td>${user.email}</td>  
     <td>${user.mobile}</td>  
    </tr>  
   </c:forEach>  
  </table>  
  
 </center> 
 
 <!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">

<head th:replace="layout :: site-head">
    <title>Spring MVC Blog</title>
</head>

<body>

</body>

</html> 
  
</body>  
</html> 