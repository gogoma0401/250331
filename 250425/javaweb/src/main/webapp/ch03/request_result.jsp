<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Map<String, Object> map = (Map<String, Object>) request.getAttribute("map");

%>
이름 : <%=map.get("name") %>
나이 : <%=map.get("age") %>
성별 : <%=map.get("gender") %>
취미 : <%=map.get("hobby") %>
</body>
</html>