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

<!-- Back To Top Button -->
<button onclick="topFunction()" id="myBtn">
    <img src="images/up-arrow.png" alt="alternative">
</button>
<!-- end of back to top button -->

</body>
</html>