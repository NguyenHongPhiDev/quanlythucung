<head>
    <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
    <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <link rel="stylesheet" href="${f:h(pageContext.request.contextPath)}/resources/stylesheet/web/index.css"/>
</head>
<div class="limiter">
    <div class="container-login100">
        <div class="wrap-login100 d-flex justify-content-center m-auto">
            <form:form  action="${f:h(pageContext.request.contextPath)}/resetPassword">
                    <span class="login100-form-title">
                        <b>Nạp Thẻ</b>
                    </span>
                <div class="wrap-input100 validate-input">
                    <select class="input100" name="price" id="price">
                        <option SELECTED value="0">-- Mệnh giá --</option>
                        <option value="20000">20.000 VNĐ</option>
                        <option value="50000">50.000 VNĐ</option>
                        <option value="100000">100.000 VNĐ</option>
                        <option value="200000">200.000 VNĐ</option>
                        <option value="500000">500.000 VNĐ</option>
                        <option value="1000000">1.000.000 VNĐ</option>
                    </select>
                </div>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" placeholder="Seri" name="seri"
                           id="seri" />
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-credit-card' ></i>
                    </span>
                </div>
                <div class="wrap-input100 validate-input">
                    <input class="input100" type="text" placeholder="Mã thẻ" name="code"
                           id="code">
                    <span class="focus-input100"></span>
                    <span class="symbol-input100">
                                <i class='bx bx-credit-card' ></i>
                    </span>
                </div>
                <div class="container-login100-form-btn">
                    <button class="btn btn-main form-control text-white" onclick="napthe()" type="button">Xác Nhận</button>
                </div>

            </form:form >
        </div>

    </div>
</div>