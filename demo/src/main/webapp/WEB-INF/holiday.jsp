<!DOCTYPE HTML>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html xmlns:th="http://www.thymeleaf.org">
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <c:out value="${name}" /><BR />
    <c:forEach var="entry" items="${holidays}">
    
    Date:
      <fmt:formatDate value="${entry.date}" pattern="yyyy" var="h" />
	      <c:if test="${h eq 1911}">
			<fmt:formatDate pattern="MM-dd" value="${entry.date}" />
		  </c:if>
	      <c:if test="${h gt 1911}">
			<fmt:formatDate pattern="yyyy-MM-dd" value="${entry.date}" />
		  </c:if>
      
    <BR />
    </c:forEach>
</body>
</html>