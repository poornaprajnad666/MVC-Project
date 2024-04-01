<%@page import="MVCprojFINAL.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>



<%
int eid = (Integer) request.getAttribute("eid");
String ename = (String) request.getAttribute("name");
String edep = (String) request.getAttribute("department");
String p = (String) request.getAttribute("location");

List<Employee> emps = (List<Employee>) request.getAttribute("employees");

 

%>



<title>Home page</title>
</head>
<body>

<div class="container mt-4 text-center">
	<h1>This is home page</h1>
		<h3>
		Good Evening
			<%=emps.get(0).getName() %>, Below are the details you have entered!!!
		</h3>
	<em> UserId = <%=emps.get(0).getEid()%> <br> UserName = <%=emps.get(0).getName()%><br>
		deparment = <%=emps.get(0).getDepartment()%> 
location= <%=emps.get(0).getLocation()%><br>
	</em>
	<a class="btn btn-primary center-button" href="addEmp">Add Employee</a>
	
	<br>
	
<form id="getEmployeeForm" method="post">
    <div class="form-row">
        <div class="form-group md-6">
            <label for="inputEid">Get Employee ById</label>
            <input type="text" class="form-control" name="eid" id="emp" placeholder="Eid">
        </div>
    </div>
</form>




  


  

</body>
</html>