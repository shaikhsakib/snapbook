
<html>  
<head>  
<title>Registration Form</title>  
<%@ include file="header.jsp" %> 
</head>  
<body>  
<%@ include file="navbar.jsp" %>
  <div class="container">  
  <c:url value="/savesnapuser" var="svCust"></c:url>
   <form:form method="post" action="${svCust}" modelAttribute="snapuser">  
    <div class="form-group ">
	<form:label path="firstName">Enter Firstname</form:label>
	<form:input required="required" class="form-control" path="firstName" />
	<form:errors path="firstName" cssStyle="color:red"></form:errors> 
	</div>
	
	<div class="form-group">
	<form:label path="lastName">Enter Lastname</form:label>
	<form:input required="required" class="form-control" path="lastName" />
	<form:errors path="lastName" cssStyle="color:red"></form:errors> 
	</div>
	
	<div class="form-group">
	<form:label path="email">Enter Email</form:label>
	<form:input required="required" class="form-control" path="email" />
	<form:errors path="email" cssStyle="color:red"></form:errors> 
	<p style="color:red">${duplicateEmail}</p>
	</div>
	
	<div class="form-group">
	<form:label path="mobile">Enter Phone number</form:label>
	<form:input required="required" class="form-control" path="mobile" />
	<form:errors path="mobile" cssStyle="color:red"></form:errors> 
	</div>
	
	
	<div class="form-group">
	<form:label path="password">Enter Password number</form:label>
	<form:input required="required" class="form-control" path="password" />
	<form:errors path="password" cssStyle="color:red"></form:errors> 
	</div>
	
	<div class="form-group">
	<input type="submit" value="Register">
	</div>
   </form:form>  
  </div> 
</body>  
</html>  