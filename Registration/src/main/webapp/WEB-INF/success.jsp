<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Successful</h1>
  First Name :<b>${customer.firstname}</b><br>
  Last Name :<b>${customer.lastname}</b><br>
  User Name :<b>${customer.username}</b><br>
  <h3>Service Plan info</h3>
  ${planinfo}
</body>
</html>