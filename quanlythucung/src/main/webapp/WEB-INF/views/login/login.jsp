
<div class=" pt-5 pb-5">
    <div class="container">
            <div class="container py-5 ">
                <div class="row d-flex justify-content-center align-items-center ">
                    <div class="col-xl-10">
                        <div class="card rounded-3 text-black">
                            <div class="row g-0">
                                <div class="col-lg-6">
                                    <div class="card-body p-md-5 mx-md-4">

                                        <div class="text-center">
                                            <img src="https://mdbootstrap.com/img/Photos/new-templates/bootstrap-login-form/lotus.png" style="width: 185px;" alt="logo">
                                            <h6 class="mt-1 mb-5 pb-1">We are The Lotus Team</h6>
                                        </div>

                                        <form:form action="${f:h(pageContext.request.contextPath)}/login">
                                            <p>Vui lòng đăng nhập</p>

                                            <div class="form-outline mb-4">
                                                <label class="form-label" for="username">Tên đăng nhập</label>
                                                <input type="text" class="form-control" id="username" name="username" placeholder="Phone number or email address"/>
                                            </div>

                                            <div class="form-outline mb-4">
                                                <label class="form-label" for="password">Mật khẩu</label>
                                                <input type="password" class="form-control" id="password" name="password" />
                                            </div>

                                            <div class="text-center pt-1 mb-5 pb-1">
                                                <a class="text-muted" href="#!">Quên mật khẩu?</a>
                                                <button class="btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" type="submit">Log in</button>
                                            </div>

                                            <div class="d-flex align-items-center justify-content-center pb-4">
                                                <p class="mb-0 me-2">Bạn chưa có tài khoản?</p>
                                                <a class="text-muted" href="${pageContext.request.contextPath}/register">Đăng ký ngay</a>
                                            </div>

                                        </form:form>
                                    </div>
                                </div>
                                <div class="col-lg-6 d-flex align-items-center gradient-custom-2">
                                    <div class="text-white px-3 py-4 p-md-5 mx-md-4">
                                        <h6 class="mb-4">We are more than just a company</h6>
                                        <p class="small mb-0">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
    </div>
</div>