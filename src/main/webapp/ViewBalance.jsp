<%@page import="Dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
	%>
	<%
		if (user == null) {
			out.print("<h1 style='color:red'>Session Expired Login Again</h1>");
			request.getRequestDispatcher("Login.html").include(request, response);
		} else {
	%>
	<h1>
		The Amount in Wallet is
		<%=user.getWallet()%></h1>
	<%
		}
	%><br><br>
	<a href="addmoney.jsp"><button>Add Money</button></a><br><br>
	<a href="UserHome.html"><button>Back</button></a><br><br>
	
</body>
</html>