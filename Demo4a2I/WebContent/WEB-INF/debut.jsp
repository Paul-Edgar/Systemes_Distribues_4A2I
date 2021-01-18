<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ include file="menu.jsp"%>

<p>
Bonjour je suis dans la JSP
</p>

<p>

<%
String variable = (String) request.getAttribute("mes");  // on le cast car on a reucp un Object
out.println("Contenu de la variable envoyée par la Servlet : " + variable);
%>
</p>

<p>
<%

for(int i=1;i<=10;i++)
{
	out.println("Bonjour");
}
%>
</p>

<p>
<%
String variablejournuit = (String) request.getAttribute("journuit");

if(variablejournuit == "Jour")
{
	out.println("Il fait jour");
}
else if((variablejournuit == "nuit"))
{
	out.println("Il fait nuit");
}
else 
{
	out.println("Rien n'a été récupéré");
}

%>
</p>
</body>
</html>