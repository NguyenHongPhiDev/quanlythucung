<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<html>
<head>
    <title>Home</title>
    <tiles:insertAttribute name="header" />

</head>
<body data-bs-spy="scroll" data-bs-target="#navbarExample">

<!-- Navigation -->
<tiles:insertAttribute name="menu" />
<!-- Header -->


<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="footer" />


</body>
</html>