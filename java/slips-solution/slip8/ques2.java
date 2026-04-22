// JSP PRIME CHECK
<html>
<body>
<%
int n=Integer.parseInt(request.getParameter("num"));
boolean p=true;

for(int i=2;i<n;i++)
    if(n%i==0) p=false;

if(p) out.println("Prime");
else out.println("Not Prime");
%>
</body>
</html>
