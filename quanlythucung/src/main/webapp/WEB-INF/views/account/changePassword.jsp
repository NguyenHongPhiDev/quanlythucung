<div id="details" class="basic-1 bg-gray">
    <div class="container bootstrap snippet">
<div class="tab-content" id="myTabContent">
    <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
        <spring:hasBindErrors name="memberChangePassword">
            <div class="hide alert alert-danger mt-0 alert-dismissible" role="alert" id="errorMsg">
                <c:forEach var="error" items="${errLst}">
                    <b><c:out value="${error}" escapeXml="false"/></b>
                    <br />
                </c:forEach>
                <button type="button" class="close" data-hide="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
            </div>
        </spring:hasBindErrors>
        <form:form modelAttribute="memberChangePassword" action="${pageContext.request.contextPath}/account/password" id="registrationForm">

            <div class="form-group mt-4">
                <div class="col-xs-6 input-group">
                    <label class="col-3" for="password"><h6>Mật khẩu cũ : </h6></label>
                    <input type="password" id="password" name="password" class="form-control" >
                    <div class="input-group-append">
                           <span class="input-group-text ">
                               <a>
                                   <i toggle="#password" class="fa fa-eye toggle toggle-password" data-map="inpPassword"></i>
                               </a>
                           </span>
                    </div>
                </div>
            </div>
            <div class="form-group mt-4">
                <div class="col-xs-6 input-group">
                    <label class="col-3" for="passwordNew"><h6>Mật khẩu mới : </h6></label>
                    <input type="password" id="passwordNew" name="passwordNew" class="form-control" >
                    <div class="input-group-append">
                       <span class="input-group-text ">
                           <a>
                               <i toggle="#passwordNew" class="fa fa-eye toggle toggle-password" data-map="inpPassword"></i>
                           </a>
                       </span>
                    </div>
                </div>
            </div>
            <div class="form-group mt-4">
                <div class="col-xs-6 input-group">
                    <label class="col-3" for="passwordConfirm"><h6>Xác nhận mật khẩu : </h6></label>
                    <input type="password" id="passwordConfirm" name="passwordConfirm" class="form-control" >
                    <div class="input-group-append">
                       <span class="input-group-text ">
                           <a>
                               <i toggle="#passwordConfirm" class="fa fa-eye toggle toggle-password" data-map="inpPassword"></i>
                           </a>
                       </span>
                    </div>
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-9 ml-auto p-0">
                    <br>
                    <button class="btn btn-success" name="change" type="submit"><i class="glyphicon glyphicon-ok-sign"></i> Lưu</button>
                    <button class="btn" type="reset" onclick="reset()"><i class="glyphicon glyphicon-repeat"></i> Nhập lại</button>
                </div>
            </div>
        </form:form>
    </div>
</div>
    </div>
</div>
<script>
    $(document).ready(function () {
        $(".toggle-password").click(function () {
            $(this).toggleClass("fa-eye fa-eye-slash");
            var input = $($(this).attr("toggle"));
            if (input.attr("type") == "password") {
                input.attr("type", "text");
            } else {
                input.attr("type", "password");
            }
        });
    });
</script>