<head>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
<%--    <link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/web/index.css"/>--%>

</head>
<h2>Giỏ Hàng</h2>
<div class="panel-body">
    <div class="table-responsive">
        <table class="table">
            <thead>
            <tr>
                <th>Stt</th>
                <th>Tên sản phẩm</th>
                <th>Loại</th>
                <th>Số lượng</th>
                <th>Giá</th>
                <th>Thành tiền</th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:set var="no" value="1"/>
            <c:forEach var="item" items="${cartItems}">
                <form:form modelAttribute="cartItem" action="${pageContext.request.contextPath}/cart/update">
                    <tr>
                        <td><strong>${no}</strong></td>
                        <td>${item.prodName}</td>
                        <td>${item.categories.catName}</td>
                        <td>
                            <input class="form-control" type="hidden" value="${item.idProd}" name="idProd">
                            <input class="form-control" type="number" value="${item.quantity}" name="quantity" onblur="this.form.submit()"/>
                        </td>
                        <td><fmt:formatNumber value="${item.price}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
                        <td><fmt:formatNumber value="${item.quantity*item.price}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
                        <td>
                            <a href="cart/remove/${item.idProd}" class="btn btn-primary" rel="tooltip"><i class="fa fa-trash-o"></i></a>
                        </td>
                    </tr>
                </form:form>
                <c:set var="no" value="${no+1}"/>
            </c:forEach>
            <tr>
                <td colspan="6">&nbsp;</td>
            </tr>
            <tr>
                <td colspan="5" class="text-right">Total Product</td>
                <td><fmt:formatNumber value="${total}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
            </tr>
            <tr>
                <td colspan="5" class="text-right">Total Shipping</td>
                <td><fmt:formatNumber value="${(no-1)*10000}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
            </tr>
            <tr>
                <td colspan="5" class="text-right"><strong>Total</strong></td>
                <td><fmt:formatNumber value="${total+(no-1)*10000}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
            </tr>
            </tbody>
        </table>
        <button class="btn btn-main float-right text-white mr-5" onclick="thanhToan()" type="button">Thanh Toán</button>
    </div>
</div>
<style>
    table tr td {
        border: 1px solid #FFFFFF;
    }

    table tr th {
        background: #eee;
    }
</style>