<!-- <html>
 <head><title>My First JSP Page</title> </head>
 <%
 int count = 0;
 %> 
<body> 
Page Count is:
 <% out.println(++count); %>
 </body>
</html>  -->
<%@ page import="java.util.*" session= 'true'
isErrorPage='false'%>
 <HTML>
 <HEAD><TITLE>PageDirectiveDemo</TITLE></HEAD>
 <BODY>
 <h4>Welcome to the world of JSP</h4>
 This JSP uses the page directive
 </BODY>
 </HTML>
