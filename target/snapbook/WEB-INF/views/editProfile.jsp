<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>  
<%@ page isELIgnored="false" %> 
<html>  
<head>  
<title>Edit Profile Page</title>  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
</head>  
<body>    
  <h1 class="text-center">Edit User Details</h1>  
  <div class="container text-center">  
   <form:form method="post" action="/update" modelAttribute="update">  
    <table>  
     <tr>  
      <td>First Name :</td>  
      <td><form:input path="firstName"  
        value="${user.firstName}" />  
      </td>  
     </tr>  
     <tr>  
      <td>Last Name :</td>  
      <td><form:input path="lastName" value="${user.lastName}" />  
      </td>  
     </tr>  
     <tr>  
      <td>Email :</td>  
      <td><form:input path="email" value="${user.email}" />  
      </td>  
     </tr>  
     <tr>  
  
      <td>Mobile :</td>  
      <td><form:input path="lastName" value="${user.mobile}" />  
      </td>  
     </tr> 
     <tr>  
  
      <td>Password :</td>  
      <td><form:input path="lastName" value="${user.password}" />  
      </td>  
     </tr>  
     <tr>  
      <td> </td>  
      <td><input type="submit" value="Save" />  
      </td>  
     </tr>  
    </table>  
    <form:hidden path="userId" value="${map.user.userId}" />  
  
   </form:form>  
  </div>  
</body>  
</html>  
