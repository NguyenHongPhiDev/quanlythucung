<h2>Cart</h2>
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
                        <td>${item.price} VNĐ</td>
                        <td>${item.quantity*item.price} VNĐ</td>
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
                <td>${total} VNĐ</td>
            </tr>
            <tr>
                <td colspan="5" class="text-right">Total Shipping</td>
                <td>${(no-1)*10000} VNĐ</td>
            </tr>
            <tr>
                <td colspan="5" class="text-right"><strong>Total</strong></td>
                <td>${total+(no-1)*10000} VNĐ</td>
            </tr>
            </tbody>
        </table>
        <a href="${pageContext.request.contextPath}/cart/pay" class="btn btn-success pull-right mr-5"><span class="glyphicon glyphicon-arrow-left"></span>&nbsp;Thanh toán</a>
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