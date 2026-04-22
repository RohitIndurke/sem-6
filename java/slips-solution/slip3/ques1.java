// JSP FILE (save as ques1.jsp)
<html>
<body>
<%
String name=request.getParameter("name");
String age=request.getParameter("age");
%>
Name: <%=name%><br>
Age: <%=age%>
</body>
</html>
