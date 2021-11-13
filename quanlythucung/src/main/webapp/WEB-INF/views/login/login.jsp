<!DOCTYPE html>
<html lang="vi">
<head>
    <title>Đăng nhập </title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/web/index.css"/>
</head>

<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100">
            <div class="login100-pic js-tilt" data-tilt>
                <img src="${f:h(pageContext.request.contextPath)}/resources/images/team.jpg" alt="IMG">
            </div>
            <form:form class="login100-form validate-form" action="${f:h(pageContext.request.contextPath)}/login">
                <span class="login100-form-title">
                        <b>ĐĂNG NHẬP SHOP</b>
                    </span>
                <c:if test="${param.containsKey('error')}">
                    <span id="loginError">
                        <h6 class="text-danger text-center">Tài khoản hoặc mật khẩu không chính xác!</h6>
                    </span>
                </c:if>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" placeholder="Tài khoản " name="username"
                           id="username">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-user'></i>
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

                <div class="container-login100-form-btn">
                    <button class="btn btn-main form-control text-white" type="submit">Đăng Nhập</button>
                    <a class="btn btn-main form-control text-white mt-1" id="loginFB"
                       href="https://www.facebook.com/dialog/oauth?client_id=182502713859613&redirect_uri=http://localhost:8080/quanlythucung/login-facebook">
                        Login with facebook
                    </a>
                </div>

                <div class="d-flex justify-content-between mb-3 mt-3">
                    <div class=" p-t-12">
                        <a class="txt2" href="${f:h(pageContext.request.contextPath)}/register">
                            Bạn chưa có tài khoản?
                        </a>

                    </div>
                    <div class=" p-t-12">
                        <a class="txt2" href="${f:h(pageContext.request.contextPath)}/resetPassword">
                            Bạn quên mật khẩu?
                        </a>
                    </div>
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
    //show - hide mật khẩu
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