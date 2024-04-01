<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add employee</title>
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container mt-3 pt-5 ">
<form action="handle-employee" method="post">

  <div class="form">
    <div class="form-group md-6">
      <label for="inputEmail4">EmployeeId</label>
      <input type="text" name="eid" class="form-control" id="inputEmail4" placeholder="EmployeeId">
    </div>
    <div class="form-group md-6">
      <label>Full Name</label>
      <input class="form-control" name="name" type="text" class="form-control" placeholder="Full name">
    </div>
  
  <div class="form-group">
    <label for="inputAddress2">Department</label>
    <input type="text" class="form-control" name="department" id="inputAddress2" placeholder="Department">
  </div>
  <div class="form-row">
    <div class="form-group md-6">
      <label for="inputCity">Location</label>
      <input type="text" class="form-control" name="location" id="Location" placeholder="Location">
    </div>    
    </div>
  </div>
  <div class="container text-center">
  <div class="form-row md-6">
  <a class="btn btn-outline-danger" href="./">Back</a>
  </div>
  <div class="form-row md-6 pt-3" >
  <button type="submit" class="btn btn-primary center-button" >Add Employee</button>
  </div>
  </div>
</form>
</div>
</body>
</html>