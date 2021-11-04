<div id="details" class="basic-1 bg-gray">
<div class="container bootstrap snippet">
    <div class="row">
        <div class="col-sm-3"><!--left col-->
            <div class="text-center">
                <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="rounded-circle" alt="avatar">
                <h6>Upload a different photo...</h6>
                <input type="file" class="text-center center-block file-upload">
            </div></hr><br>


            <ul class="list-group">
                    <li class="list-group-item">Website <i class="fa fa-dashboard fa-1x"></i></li>
                    <li class="list-group-item p-0"><a class="nav-link" href="http://bootnipets.com">bootnipets.com</a></li>
            </ul>

            <ul class="list-group">
                <li class="list-group-item text-muted">Activity <i class="fa fa-dashboard fa-1x"></i></li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Shares</strong></span> 125</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Likes</strong></span> 13</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Posts</strong></span> 37</li>
                <li class="list-group-item text-right"><span class="pull-left"><strong>Followers</strong></span> 78</li>
            </ul>

            <div class="panel panel-default">
                <div class="panel-heading">Social Media</div>
                <div class="panel-body">
                    <i class="fa fa-facebook fa-2x"></i> <i class="fa fa-github fa-2x"></i> <i class="fa fa-twitter fa-2x"></i> <i class="fa fa-pinterest fa-2x"></i> <i class="fa fa-google-plus fa-2x"></i>
                </div>
            </div>

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

    function reset(){
        location.reload();
    }
</script>
