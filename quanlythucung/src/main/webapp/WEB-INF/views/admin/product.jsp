<div class="panel-body">
    <div class="table-responsive">
        <table class="table col-10 m-auto">
            <thead>
            <tr>
                <td>
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addNew">
                        Thêm mới
                    </button>
                </td>
            </tr>
            <tr>
                <th>ID</th>
                <th>Tên Sản phẩm</th>
                <th>Loại</th>
                <th>Giá</th>
                <th>Số lượng</th>
                <th class="col-4 text-center">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${product}">
            <tr>
                <td>${item.idProd}</td>
                <td>${item.prodName}</td>
                <td>${item.categories.catName}</td>
                <td>
                    <fmt:formatNumber value="${item.price}" minFractionDigits="0" maxFractionDigits="0"/></td>
                <td>${item.quantity}</td>
                <td class="text-center">
                    <button type="button" class="btn btn-primary" value="${item.idProd};${item.prodName};${item.categories.idCat};<fmt:formatNumber value="${item.price}" minFractionDigits="0" maxFractionDigits="0"/>;${item.quantity}" onclick="change(this)" data-bs-toggle="modal" data-bs-target="#updateProduct">
                        <i class="fas fa-pencil-alt"></i>
                    </button>
                    <a href="${pageContext.request.contextPath}/admin/product/remove/${item.idProd}" class="btn btn-danger ml-3" rel="tooltip"><i class="fa fa-trash-o"></i></a>
                </td>
            </tr>
            </c:forEach>
        </table>
        <div class="pagination">
            <t:pagination page="${page}"/>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="addNew" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content m-auto p-0 col-6">
            <div class="modal-body">
                <h5 class="modal-title text-center">Thêm mới</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                <form:form modelAttribute="category" action="${pageContext.request.contextPath}/admin/product/add" >
                    <div class="input-group">
                        <span class="input-group-text" >Tên Sản phẩm :</span>
                        <input type="text" class="form-control" name="prodName" id="prodName">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text" >Loại :</span>
                        <select class="form-select" name="idCat">
                            <c:forEach items="${category}" var="itemCate">
                                <option value="${itemCate.idCat}">${itemCate.catName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="input-group">
                        <span class="input-group-text">Giá :</span>
                        <input type="text" class="form-control" name="price" id="price">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text" >Số lượng :</span>
                        <input type="text" class="form-control" name="quantity" id="quantity">
                    </div>
                    <div class="mt-4 d-flex justify-content-end">
                        <button type="submit" class="btn btn-primary">Thêm</button>
                        <button type="button" class="btn btn-secondary ml-3" data-bs-dismiss="modal">Đóng</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
<!-- Modal -->
<div class="modal" id="updateProduct" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content m-auto p-0 col-6">
            <div class="modal-body">
                <h5 class="modal-title text-center">Update</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                <form:form modelAttribute="product" action="${pageContext.request.contextPath}/admin/product/update" >
                    <div class="input-group">
                        <span class="input-group-text" >Id Sản phẩm :</span>
                        <input type="text" class="form-control" readonly name="idProd" id="idProd_">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text" >Tên Sản phẩm :</span>
                        <input type="text" class="form-control" name="prodName" id="prodName_">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text" >Loại :</span>
                        <select class="form-select" name="idCat" id="idCat_">
                            <c:forEach items="${category}" var="itemCate">
                                <option value="${itemCate.idCat}">${itemCate.catName}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="input-group">
                        <span class="input-group-text">Giá :</span>
                        <input type="text" class="form-control" name="price" id="price_">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text" >Số lượng :</span>
                        <input type="text" class="form-control" name="quantity" id="quantity_">
                    </div>
                    <div class="mt-4 d-flex justify-content-end">
                        <button type="submit" class="btn btn-primary">Thêm</button>
                        <button type="button" class="btn btn-secondary ml-3" data-bs-dismiss="modal">Đóng</button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</div>
