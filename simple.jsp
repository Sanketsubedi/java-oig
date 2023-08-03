<html>
 <head><title>JSPDeclarationDemo</title></head>
 <body>
<%@ page import = "java.util.Date" %>
<%!
String getGreeting( String name){
Date d = new Date();
return "Hey " + name + "! It's "+  d ;
}
%>
<h3> This is a JSP Declaration demo. The JSP invokes the
    global method to produce the following
</h3>
<hr/>
<h3> <%= getGreeting("Guys") %>
<hr/>
</body>
</html>
<!-- sir le gareko ma bug aaaxa kina ho thaxaina please follow the double quote
carefully -->