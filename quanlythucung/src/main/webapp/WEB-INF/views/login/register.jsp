<head>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
</head>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="${f:h(pageContext.request.contextPath)}/resources/images/team.jpg" alt="IMG">
            </div>
            <form:form class="login100-form validate-form" modelAttribute="memberRegister" action="${f:h(pageContext.request.contextPath)}/register">
                    <span class="login100-form-title">
                        <b>ĐĂNG KÝ TÀI KHOẢN</b>
                    </span>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" placeholder="Tài khoản " name="username"
                           id="username">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-user'></i>
                            </span>
                </div>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" placeholder="Nhập email" name="email"
                           id="email"/>
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-mail-send' ></i>
                            </span>
                </div>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="password" placeholder="Mật khẩu"
                           name="password" id="password">
                    <span toggle="#password" class="bx fa-fw bx-hide field-icon click-eye"></span>
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-key'></i>
                            </span>
                </div>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="password" placeholder="Xác nhận mật khẩu"
                           name="passwordConfirm" id="passwordConfirm">
                    <span toggle="#passwordConfirm" class="bx fa-fw bx-hide field-icon click-eye"></span>
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-key'></i>
                            </span>
                </div>

                <div class="container-login100-form-btn">
                    <button class="btn btn-main form-control" name="register" type="submit">Đăng Ký</button>
                </div>
                    <div class="text-right p-t-12 mt-3 mb-3">
                        Bạn đã có tài khoản?
                        <a class="txt2" href="${f:h(pageContext.request.contextPath)}/login">
                            Đăng nhập ngay
                        </a>

                    </div>

            </form:form>
            <div class="text-center p-t-70 txt2">
                Phần mềm quản lý thú cưng <i class="far fa-copyright" aria-hidden="true"></i>
                <script type="text/javascript">document.write(new Date().getFullYear());</script> <a
                    class="txt2" href="#"> Được code bởi Phi </a>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    function myFunction() {
        var x = document.getElementById("myInput");
        if (x.type === "password") {
            x.type = "text"
        } else {
            x.type = "password";
        }
    }
    $(".click-eye").click(function () {
        $(this).toggleClass("bx-show bx-hide");
        var input = $($(this).attr("toggle"));
        if (input.attr("type") == "password") {
            input.attr("type", "text");
        } else {
            input.attr("type", "password");
        }
    });
</script>