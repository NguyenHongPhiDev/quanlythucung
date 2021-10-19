<nav id="navbarExample" class="navbar navbar-expand-lg fixed-top navbar-light" aria-label="Main navigation">
    <div class="container">

        <!-- Image Logo -->
        <a class="navbar-brand logo-image" href="index"><img src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="alternative"></a>

        <!-- Text Logo - Use this if you don't have a graphic logo -->
        <!-- <a class="navbar-brand logo-text" href="index.html">Ioniq</a> -->

        <button class="navbar-toggler p-0 border-0" type="button" id="navbarSideCollapse" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav ms-auto navbar-nav-scroll">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index">Trang chủ</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-bs-toggle="dropdown" aria-expanded="false">Nhãn Hiệu</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown01">
                        <li><a class="dropdown-item" href="#">Hana Pet</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="#">Kong (USA)</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="#">Meo (Thailand)</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown02" data-bs-toggle="dropdown" aria-expanded="false">Shop Cho Chó</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown02">
                        <li><a class="dropdown-item" href="article.html">Thức ăn cho chó</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="terms.html">Quần áo cho chó</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Vật dụng ăn uống cho chó</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Y tế và thuốc cho chó</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Dụng Cụ Vệ Sinh</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Chuồng chó,nhà,giường,túi</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Đồ chỉ bán online</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown03" data-bs-toggle="dropdown" aria-expanded="false">Shop Cho Mèo</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown02">
                        <li><a class="dropdown-item" href="article.html">Thức ăn cho mèo</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="terms.html">Quần áo cho mèo</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Vật dụng ăn uống cho mèo</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Y tế và thuốc cho mèo</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Dụng Cụ Vệ Sinh</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Chuồng mèo,nhà,giường,túi</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Cát vệ sinh</a></li>

                    </ul>
                </li>
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="index">Khuyến Mãi</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="index">Liên Hệ</a>
                </li>

            <sec:authorize access="hasRole('ADMIN')">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown08" data-bs-toggle="dropdown" aria-expanded="false">Quản lý</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown08">
                        <li><a class="dropdown-item" href="#">Danh sách thành viên</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="#">Danh sách nhân viên</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="#">Kho hàng</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="#">Thống kê</a></li>
                    </ul>
                </li>
            </sec:authorize>
            <sec:authorize access="!isAuthenticated()">
                <span class="nav-item">
                            <a class="btn-outline-sm" href="login">Đăng Nhập</a>
                </span>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <sec:authentication var="user" property="principal" />
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle active" href="#" id="dropdown09" data-bs-toggle="dropdown" aria-expanded="false">${user.username}</a>
                            <ul class="dropdown-menu" aria-labelledby="dropdown09">
                                <li><a class="dropdown-item" href="#">Thông tin tài khoản</a></li>
                                <li><div class="dropdown-divider"></div></li>
                                <li><a class="dropdown-item" href="#">Lịch sử giao dịch</a></li>
                                <li><div class="dropdown-divider"></div></li>
                                <li><a class="dropdown-item" href="#">Đổi mật khẩu</a></li>
                                <li><div class="dropdown-divider"></div></li>
                                <li><a class="dropdown-item" href="#">Đăng xuất</a></li>
                            </ul>
                        </li>
            </sec:authorize>
            </ul>
        </div> <!-- end of navbar-collapse -->
    </div> <!-- end of container -->
</nav> <!-- end of navbar -->