<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheet/bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheet/fontawesome/css/all.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheet/bootstrap/bootstrap-datepicker3.css">
<script type="text/javascript"  src="${pageContext.request.contextPath}/resources/javascript/plugin/jquery/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/bootstrap/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/bootstrap/bootstrap-input-spinner.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/bootstrap/bootstrap-select.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/bootstrap/notify.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/bootstrap/bootstrap-datepicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/bootstrap/bootstrap-datepicker.ja.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/jtsage/jtsage-datebox-5.3.3.bootstrap4.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/plugin/jtsage/jtsage-datebox.lang.utf8.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/common.js"></script>
<script src="${f:h(pageContext.request.contextPath)}/resources/javascript/bootstrap.min.js"></script> <!-- Bootstrap framework -->
<script src="${f:h(pageContext.request.contextPath)}/resources/javascript/swiper.min.js"></script> <!-- Swiper for image and text sliders -->
<script src="${f:h(pageContext.request.contextPath)}/resources/javascript/purecounter.min.js"></script> <!-- Purecounter counter for statistics numbers -->
<script src="${f:h(pageContext.request.contextPath)}/resources/javascript/replaceme.min.js"></script> <!-- ReplaceMe for rotating text -->
<script src="${f:h(pageContext.request.contextPath)}/resources/javascript/scripts.js"></script> <!-- Custom scripts -->
<link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/bootstrap.min.css"/>
<link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/fontawesome-all.min.css"/>
<link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/swiper.css"/>
<link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/styles.css"/>
<c:if test="${!empty styleSheet}">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/stylesheet/${styleSheet}">
</c:if>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/javascript/product.js"></script>
<style>
    .carousel-inner > .testimonial-group > .row {
        overflow-x: auto;
        white-space: nowrap;
    }
    .carousel-inner > .testimonial-group > .row > .col-sm-3 {
        display: inline-block;
        float: none;
    }
    .carousel-inner > .testimonial-group > .itemScroll{
        display: block;!important;
    }
    button,input,select{
        outline: none !important;
        box-shadow: none !important;
    }

    button,input,select:hover{
        outline: none !important;
        box-shadow: none !important;
    }
    button,input,select:focus{
        outline: none !important;
        box-shadow: none !important;
    }
    .pagination {
        height: 36px;
        margin: 18px 0;
        text-align: center;
    }

    .pagination ul {
        margin: auto;
        display: inline-block;
        *display: inline;
        /* IE7 inline-block hack */
        *zoom: 1;
        -webkit-border-radius: 3px;
        -moz-border-radius: 3px;
        border-radius: 3px;
        -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05);
        -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05);
        box-shadow: 0 1px 2px rgba(0, 0, 0, 0.05);
    }

    .pagination li {
        display: inline;
    }

    .pagination a {
        float: left;
        padding: 0 14px;
        line-height: 34px;
        text-decoration: none;
        border: 1px solid #ddd;
        border-left-width: 0;
    }

    .pagination a:hover, .pagination .active a {
        background-color: #f5f5f5;
    }

    .pagination .active a {
        color: #999999;
        cursor: default;
    }

    .pagination .disabled a, .pagination .disabled a:hover {
        color: #999999;
        background-color: transparent;
        cursor: default;
    }

    .pagination li:first-child a {
        border-left-width: 1px;
        -webkit-border-radius: 3px 0 0 3px;
        -moz-border-radius: 3px 0 0 3px;
        border-radius: 3px 0 0 3px;
    }

    .pagination li:last-child a {
        -webkit-border-radius: 0 3px 3px 0;
        -moz-border-radius: 0 3px 3px 0;
        border-radius: 0 3px 3px 0;
    }

    .pagination-centered {
        text-align: center;
    }

    .pagination-right {
        text-align: right;
    }
</style>
<c:if test="${!empty js}">
    <script src="${pageContext.request.contextPath}/resources/javascript/${js}"></script>
</c:if>
