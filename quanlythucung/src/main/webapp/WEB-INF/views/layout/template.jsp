<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<html>
<head>
    <title>Home</title>
    <tiles:insertAttribute name="header" />
<c:if test="${style!=null}">

</c:if>
</head>
<body data-bs-spy="scroll" data-bs-target="#navbarExample">

<!-- Navigation -->
<tiles:insertAttribute name="menu" />
<!-- Header -->

<div id="details" class="basic-1 bg-gray">
    <div class="container bootstrap snippet">
        <tiles:insertAttribute name="body" />
    </div>
</div>
<tiles:insertAttribute name="footer" />


</body>
</html>