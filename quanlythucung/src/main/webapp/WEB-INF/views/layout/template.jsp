<%@ page import="java.text.DecimalFormat" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<html>
<head>
    <link rel="icon" href="${pageContext.request.contextPath}/resources/images/logo1.jpg" type="image/x-icon">
    <title>

        <c:if test="${title!=null}">
            ${title}
        </c:if></title>
    <tiles:insertAttribute name="header" />
    <style>
        .table-responsive,.itemScroll{
            overflow-x: hidden!important;
        }
    </style>
</head>
<body style="padding-right: 0px !important;">

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
