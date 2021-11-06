<head>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
</head>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="${f:h(pageContext.request.contextPath)}/resources/images/team.jpg" alt="IMG">
            </div>
                <form:form action="${f:h(pageContext.request.contextPath)}/resetPassword">
                    <span class="login100-form-title">
                        <b>KHÔI PHỤC MẬT KHẨU</b>
                    </span>
                    <div class="wrap-input100 validate-input">
                        <input class="input100" type="text" placeholder="Tài khoản " name="username"
                               id="username">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                                <i class='bx bx-user'></i>
                        </span>
                    </div>
                    <div class="wrap-input100 validate-input"
                         data-validate="Email đã đăng ký">
                        <input class="input100" type="text" placeholder="Nhập email đã đăng ký" name="email"
                               id="email" value="" />
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                                <i class='bx bx-mail-send' ></i>
                        </span>
                    </div>
                    <div class="container-login100-form-btn">
                        <button class="btn btn-main form-control" onclick="resetPassWord()" type="button">Lấy mật khẩu</button>
                    </div>

                    <div class="text-right p-t-12 mt-3">
                        <a class="txt2" href="${f:h(pageContext.request.contextPath)}/login">
                            Trở về đăng nhập
                        </a>
                    </div>
            </form:form >
            <div class="text-center p-t-70 txt2">
                Phần mềm quản lý thú cưng <i class="far fa-copyright" aria-hidden="true"></i>
                <script type="text/javascript">document.write(new Date().getFullYear());</script> <a
                    class="txt2" href="#"> Được code bởi Phi </a>
            </div>
        </div>
    </div>
</div>