<!-- scripting elements and their funtionality -->

<!-- comment ->  <% comment %> -->
<!-- directive ->  <%@ directive %> -->
<!-- declaration ->  <%! declaration %> -->
<!-- scriptlets ->  <% scriptlets %> -->
<!-- expression ->  <%= expression %> -->


<!-- JSP DIRECTIVES IS DEMONSTRATED IN FILE TEST.JSP AND NEWJSP.JSP -->

<!-- PAGE DIRECTIVE IS USED TO -> IMPORT CLASSES <%@ page import="java.util.*"%> 
                               -> CREATE SESSION <%@ page session="true"%> 
                               -> TO BRING ERROR PAGE <%@ page errorPage="Error.jsp"%>
                               ->  If a JSP page should allow itself as an error page for other JSP pages <%@ page isErrorPage=”true” %> -->


<!-- INCLUDE DIRECTIVE IS USED TO  include the response of another resource (JSP or html) at the point where the directive is placed in the current JSP.
<%@ include file=”file_name” %>-->

<!-- TAGLIB DIRECTIVES allows the JSP page to use custom tags written in Java. Custom tag definitions are usually defined in a separate file called as Tag Library Descriptor
<%@ taglib uri=”location_of_definition_file”prefix=”prefix_name” %> -->

<!-- yo uri nai ho hai  -->

<!-- example:
<%@ taglib uri = "http://www.example.com/custlib" prefix = "mytag" %>

<html>
   <body>
      <mytag:hello/>
   </body>
</html> -->


<!-- JSP Declarations
<%!
 Variable declarations
 Global methods
 %> -->
 <!-- It is used to make a global method or function whih can be used all over the JSp file -->
 <!-- example is presented in simple.jsp  -->


 <!-- JSP Expressions
 <%= Java Expression %>
 Expressions in JSP are used to display the dynamic content in the page. An expression could be a 
variable or a method that returns some data or anything that returns a value back. -->
<!-- example presented in 2016fall6b/processRegister.jsp line:33  -->
<!-- 
JSP Scriptlets 
A Scriptlet is a piece of Java code that represents processing logic to generate and display the 
dynamic content where ever needed in the page. Scriptlets are enclosedbetween <% and %> 
symbols. -->
<!-- most important examples are demostrated at forms and all examples  -->