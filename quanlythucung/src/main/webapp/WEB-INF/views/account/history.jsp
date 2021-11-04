<div class="panel-body">
    <div class="table-responsive">
        <table class="table col-9 m-auto">
            <thead>
            <tr>
                <th>Mã giao dịch</th>
                <th>Tổng tiền</th>
                <th>Trạng thái</th>
                <th>Ngày thanh toán</th>
                <th class="text-center">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${items}">
            <tr>
                <td>${item.idOrd}</td>
                <td>
                    <fmt:formatNumber value="${item.total}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ</td>
                <td>
                <c:if test="${item.status == '0'}">
                    Chưa thanh toán
                </c:if>
                <c:if test="${item.status == '1'}">
                    Đã thanh toán
                </c:if>
                </td>
                <td>${item.date}</td>
                <td>
                    <button onclick="detail(${item.idOrd})" class="btn btn-primary float-left" data-bs-toggle="modal" data-bs-target="#detail">Chi tiết</button>
                    <button onclick="detail(${item.idOrd})" class="btn btn-danger ml-2" data-bs-toggle="modal" data-bs-target="#detail">Xóa</button>
                    <c:if test="${item.status == '0'}">
                        <a href="${pageContext.request.contextPath}/admin/product/remove/${item.idOrd}" class="btn btn-success float-right" rel="tooltip">Thanh toán</a>
                    </c:if>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
<!-- Modal -->
<div class="modal" id="detail" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content m-auto p-0 col-10">
            <div class="modal-body">
                <h5 class="modal-title text-center">Thông tin đơn hàng</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                <table class="table m-auto">
                    <thead>
                        <tr>
                            <th>Mã Sản Phẩm</th>
                            <th>Tên Sản Phẩm</th>
                            <th>Loại Sản Phẩm</th>
                            <th>Số lượng</th>
                            <th>Giá</th>
                            <th>Tổng tiền</th>
                        </tr>
                    </thead>
                    <tbody id="message">
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
