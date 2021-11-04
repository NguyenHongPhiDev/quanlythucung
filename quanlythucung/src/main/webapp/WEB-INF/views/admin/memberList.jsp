<div class="panel-body">
    <div class="table-responsive">
        <table class="table m-auto">
            <thead>
            <tr>
                <th>ID</th>
                <th>Tên</th>
                <th>Email</th>
                <th>Tên đăng nhập</th>
                <th>Giới tính</th>
                <th>Số điện thoại</th>
                <th>Địa chỉ</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${member}">
            <tr>
                <td>${item.id}</td>
                <td>${item.fullName}</td>
                <td>${item.email}</td>
                <td>${item.username}</td>
                <td><c:forEach items="${CL_SEX}" var="cl">
                        <c:if test="${cl.key == item.sex}">
                            <option selected value="${cl.key}">${cl.value}</option>
                        </c:if>
                </c:forEach></td>
                <td>${item.phoneNumber}</td>
                <td>${item.address}</td>
                <td>
                    <c:if test="${item.status == '0'}" >
                    <a href="${pageContext.request.contextPath}/admin/member/lock/${item.id}" class="btn btn-primary" rel="tooltip"><i class="fas fa-lock"></i></a>
                    </c:if>
                    <c:if test="${item.status == '1'}" >
                        <a href="${pageContext.request.contextPath}/admin/member/unlock/${item.id}" class="btn btn-success" rel="tooltip"><i class="fas fa-unlock"></i></a>
                    </c:if>
                </td>
                <td>
                    <a href="${pageContext.request.contextPath}/admin/member/remove/${item.id}" class="btn btn-danger" rel="tooltip"><i class="fa fa-trash-o"></i></a>
                </td>
            </tr>
            </c:forEach>
        </table>
    </div>
</div>
<!-- Modal -->