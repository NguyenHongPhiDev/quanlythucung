<div class="panel-body">
    <div class="table-responsive">
        <table class="table col-6 m-auto">
            <thead>
           <tr>
               <td>
                   <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#addNew">
                       Thêm mới
                   </button>
               </td>
           </tr>
            <tr>
                <th >ID</th>
                <th >Tên Loại</th>
                <th class="col-4 text-center">Action</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${cateList}">
                    <tr>
                        <td>${item.idCat}</td>
                        <td>${item.catName}</td>
                        <td class="text-center">
                            <button type="button" class="btn btn-primary" value="${item.idCat};${item.catName}" onclick="change(this)" data-bs-toggle="modal" data-bs-target="#updateCategory">
                                <i class="fas fa-pencil-alt"></i>
                            </button>
                            <a href="category/remove/${item.idCat}" class="btn btn-danger ml-3" rel="tooltip"><i class="fa fa-trash-o"></i></a>
                        </td>
                    </tr>
            </c:forEach>
        </table>
    </div>
</div>
<!-- Modal -->
<div class="modal fade" id="addNew" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content m-auto p-0 col-6">
            <div class="modal-body">
                <h5 class="modal-title text-center">Thêm mới</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                <form:form modelAttribute="category" action="${pageContext.request.contextPath}/admin/category/add" >
                    <div class="input-group">
                        <span class="input-group-text" id="basic-addon1">Tên loại :</span>
                        <input type="text" class="form-control" name="catName" id="catName">
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
<div class="modal" id="updateCategory" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content m-auto p-0 col-6">
            <div class="modal-body">
                <h5 class="modal-title text-center">Update</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                <form:form modelAttribute="category" action="${pageContext.request.contextPath}/admin/category/update" >
                    <div class="input-group">
                        <span class="input-group-text" >Id :</span>
                        <input type="text" class="form-control" readonly id="idCat_">
                    </div>
                    <div class="input-group">
                        <span class="input-group-text" >Tên loại :</span>
                        <input type="text" class="form-control" id="catName_" >
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
