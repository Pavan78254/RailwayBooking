<%@page import="java.util.Arrays"%>
<%@page import="Dto.Train"%>
<%@page import="Dao.TrainDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Train</title>
</head>
<body>
<%
TrainDao dao=new TrainDao();
Train train=dao.fetch(Integer.parseInt(request.getParameter("tnumber")));
%>
<form action="updatetrain" method="post">
Train Number:<input type="number" name="tnumber" value="<%=train.getNumber()%>" readonly="readonly"><br><br>
Train Name:<input type="text" name="tname" value="<%=train.getName()%>"><br><br>
Number of Seats:<input type="number" name="tseat" value="<%=train.getSeat()%>"><br><br>
Stations:<textarea rows="5" cols="30" name="tstation" value="<%=Arrays.toString(train.getStations()) %>"></textarea><br><br>
Ticket Price:<textarea rows="5" cols="30" name="tprice" value="<%=Arrays.toString(train.getPrice()) %>" ></textarea><br><br>
Time:<textarea rows="5" cols="30" name="ttime" value="<%=Arrays.toString(train.getTime()) %>"></textarea><br><br>
Days:<textarea rows="5" cols="30" name="tdays" value="<%=Arrays.toString(train.getDays()) %>" ></textarea><br><br>
<button type="reset">Cancel</button>
<button>Update</button>
</form>
</body>
</html>