<h2>Cart</h2>
<hr>
<table>
    <tr>
        <td>No.</td>
        <td>Name</td>
        <td>Quantity</td>
        <td>Price</td>
        <td></td>
    </tr>
    <c:forEach var="item" items="${cartItems}">
        <c:set var="no" value="1"/>
        <form:form modelAttribute="cartItem" action="${pageContext.request.contextPath}/cart/update">
            <tr>
                <td>${no}</td>
                <td>${item.prodName}</td>
                <td>
                    <input type="hidden" value="${item.idProd}" name="idProd">
                    <input type="number" value="${item.quantity}" name="quantity" onblur="this.form.submit()"/>
                </td>
                <td>${item.price}</td>
                <td>
                    <a href="cart/remove/${item.idProd}">Xóa</a>
                </td>
            </tr>
        </form:form>
        <c:set var="no" value="${no+1}"/>
    </c:forEach>
</table>