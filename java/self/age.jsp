<%@page language="java"%>
<html>
<body>
<form method="post">
Enter Name:<input type="text" name="nam">
Enter Name:<input type="number" name="age">
<input type="submit" value="submit">
</form>
<%
String name = request.getParameter("nam");
String ages = request.getParameter("age");
age = Integer.parseInt(ages)
if(age>=18){
%>
<h1>eligiable</h1>
<%}else{
%>
<h1>not eligable</h1>
<%
}
%>
<body>
</html>
