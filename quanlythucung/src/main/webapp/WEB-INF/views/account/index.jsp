<div id="details" class="basic-1 bg-gray">
<div class="container bootstrap snippet">
    <div class="row">
        <div class="col-sm-3"><!--left col-->
            <div class="text-center">
                <c:if test="${user.urlImage == null}">
                    <img id="image" multiple src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="rounded-circle" alt="avatar">
                </c:if>
                <c:if test="${user.urlImage != null}">
                    <img id="image" width="192px" height="192px" multiple src="${pageContext.request.contextPath}/img/${user.urlImage}" class="rounded-circle" alt="avatar">
                </c:if>
                <input type="file" onchange="view()" name="img" id="file" class="text-center center-block file-upload">
            </div></hr><br>


            <ul class="list-group price">
                    <li class="list-group-item p-0">
                        <div class="col-xs-6 input-group">
                            <input type="password"  readonly value="<fmt:formatNumber value="${user.balance}" minFractionDigits="0" maxFractionDigits="0"/> VNĐ" id="password" name="password" class="form-control price" >
                            <div class="input-group-append price">
                               <span class="input-group-text price">
                                   <a>
                                       <i toggle="#password" class="fa fa-eye toggle toggle-password price" data-map="inpPassword"></i>
                                   </a>
                               </span>
                            </div>
                        </div>
                    </li>
            </ul>

            <ul class="list-group">
                <li class="list-group-item text-muted">Hoạt động</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Số đơn hàng :</strong></span> ${totalOrder}</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Số đơn đã thanh toán :</strong></span> ${totalOrder1}</li>
                <li class="list-group-item text-right"><span class="pull-left text-dark"><strong>Số đơn chưa thanh toán :</strong></span> ${totalOrder0}</li>
            </ul>
        </div><!--/col-3-->
        <div class="col-sm-9">
            <ul class="nav nav-tabs" id="myTab" role="tablist">
                <li class="nav-item">
                    <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Profile</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" id="contact-tab" data-toggle="tab" href="#contact" role="tab" aria-controls="contact" aria-selected="false">Contact</a>
                </li>
            </ul>
            <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                    <form:form modelAttribute="userUpdate" action="${pageContext.request.contextPath}/account" id="registrationForm">
                    
                        <div class="form-group mt-4">

                            <div class="col-xs-6">
                                <label for="fullName"><h6>Họ Tên </h6></label>
                                <input type="text" id="fullName" name="fullName" class="form-control" value="${user.fullName}" placeholder="Họ và tên" >
                            </div>
                        </div>

                        <div class="form-group">

                            <div class="col-xs-6">
                                <label for="email"><h6>Email</h6></label>
                                <input type="text" class="form-control" value="${user.email}" name="email" id="email" placeholder="Email" >
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-xs-6">
                                <label for="birthDate"><h6>Năm Sinh</h6></label>
                                <input type="text" class="form-control" value="${user.birthDate}" name="birthDate" id="birthDate" placeholder="Năm Sinh">
                            </div>
                        </div>
                        <div class="form-group">

                            <div class="col-xs-6">
                                <label for="sex"><h6>Giới tính</h6></label>
                                <select id="sex" name="sex" class="custom-select">
                                    <c:forEach items="${CL_SEX}" var="cl">
                                        <c:choose>
                                            <c:when test="${cl.key == user.sex}">
                                                <option selected value="${cl.key}">${cl.value}</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="${cl.key}">${cl.value}</option>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">

                            <div class="col-xs-6">
                                <label for="address"><h6>Địa chỉ</h6></label>
                                <input type="address" class="form-control" id="address" value="${user.address}" name="address" placeholder="Địa chỉ">
                            </div>
                        </div>
                        <div class="form-group">

                            <div class="col-xs-6">
                                <label for="phoneNumber"><h6>Số điện thoại</h6></label>
                                <input type="text" class="form-control" name="phoneNumber" value="${user.phoneNumber}" id="phoneNumber" placeholder="Số điện thoại" >
                            </div>
                        </div>
                                <input type="text" hidden class="form-control" name="urlImage" id="urlImage">
                        <div class="form-group">
                            <div class="col-xs-12">
                                <br>
                                <button class="btn btn-success" name="update" type="submit"><i class="glyphicon glyphicon-ok-sign"></i> Lưu</button>
                                <button class="btn" type="reset" onclick="reset()"><i class="glyphicon glyphicon-repeat"></i> Nhập lại</button>
                            </div>
                        </div>
                    </form:form>
                </div>
                <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">

                </div>
                <div class="tab-pane fade" id="contact" role="tabpanel" aria-labelledby="contact-tab">

                </div>
            </div>
        </div><!--/tab-content-->

    </div><!--/col-9-->
</div><!--/row-->
</div>
<script>
    $(document).ready(function () {
        $(".toggle-password").click(function () {
            $(this).toggleClass("fa-eye fa-eye-slash");
            var input = $($(this).attr("toggle"));
            if (input.attr("type") == "password") {
                input.attr("style","")
                input.attr("type", "text");
            } else {
                input.attr("type", "password");
            }
        });
    });
    function view(){
        let img = document.getElementById("file");
        let data = new FormData()
        data.append("img",img.files[0]);
        var reader = new FileReader();
        reader.onload = function (e) {
            document.getElementById("image").src = e.target.result;
        };
        reader.readAsDataURL(document.getElementById("file").files[0]);
        $.ajax({
            url: 'http://localhost:8080/quanlythucung/image/upload',
            type: "POST",
            iframe: true,
            cache: false,
            contentType:false,
            processData:false,
            data: data,
            success : function(response) {
                $('#urlImage').val(response);
                console.log("upload ảnh thành công!")
            },
            error: function(){
                console.log("Update ảnh lỗi!");
            }
        });
    }
    function reset(){
        location.reload();
    }
</script>
