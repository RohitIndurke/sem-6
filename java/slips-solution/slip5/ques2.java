// JSP FILE (save as ques2.jsp)
<html>
<body>
<form method="post">
Q1: Java is?<br>
<input type="radio" name="q1" value="1">Language
<input type="radio" name="q1" value="0">Animal
<br><input type="submit">
</form>

<%
if(request.getParameter("q1")!=null){
    int s=Integer.parseInt(request.getParameter("q1"));
    out.println("Score: "+s);
}
%>
</body>
</html>
