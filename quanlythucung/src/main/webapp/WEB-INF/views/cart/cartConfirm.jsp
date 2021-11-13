<head>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <%--    <link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/web/index.css"/>--%>

</head>
<h2>Xác nhận thanh toán</h2>
<div class="panel-body">
    <c:set var="no" value="${no1}"/>
    <div class="table-responsive">
        <table class="table">
            <tr>
                <td>
                    <label for="name">Họ tên</label>
                    <input id="name" type="text" class="form-control">
                </td>
                <td  class="text-right">Tổng tiền sản phẩm :</td>
                <td><fmt:formatNumber value="${total}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
            </tr>
            <tr>
                <td>
                    <label for="email" >Email :</label>
                    <input id="email" type="text" class="form-control">
                </td>
                <td  class="text-right">Tổng tiền ship :</td>
                <td><fmt:formatNumber value="${(no-1)*10000}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
            </tr>
            <tr>
                <td>
                    <label for="number" >Số điện thoại</label>
                    <input id="number" type="text" class="form-control">
                </td>
                <td class="text-right"><strong>Tổng tiền phải trả :</strong></td>
                <td><fmt:formatNumber value="${total+(no-1)*10000}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
            </tr>
            <tr>
                <td>
                    <label for="address">Địa chỉ</label>
                    <input id="address" type="text" class="form-control">
                </td>
                <td>
                    <button class="btn btn-main float-right text-white ml-5" onclick="thanhToan()" type="button">Thanh Toán</button>
                </td>
            </tr>
        </table>
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