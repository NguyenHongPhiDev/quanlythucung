function thanhToan(){
    var regex = /^[a-zA-Z0-9\\ ]+$/;
    var regexSdt = /^[0-9]+$/;
    console.log($('#name').val());
    if ($('#name').val()==''){
        alert("Họ và tên không được để trống!");
        return;
    }else if(($('#name').val()) != ($('#name').val().match(regex))) {
        alert("Tên không được chứa ký tự đặc biệt!")
        return;
    }
    if ($('#number').val()==''){
        alert("Số điện thoại không được để trống!");
        return;
    }else if(($('#number').val()) != ($('#number').val().match(regexSdt))) {
        alert("Số điện thoại chỉ được chứa ký tự số!")
    }
    if ($('#address').val()==''){
        alert("Địa chỉ không được để trống!");
        return;
    }
    var filterData = {
        address: $('#address').val(),
    }
    var url = "http://localhost:8080/quanlythucung/cart/pay/";
        $.ajax({
            url: url,
            type: "POST",
            data : filterData,
            success: function (response) {
                if(response=='0'){
                    window.location = "http://localhost:8080/quanlythucung/login";
                }else if(response=='1'){
                    swal({
                        icon: 'info',
                        title: 'Thanh toán Thất bại',
                        text: 'Tài khoản của bạn không đủ để thanh toán!'
                    })
                }else {
                    swal({
                        icon: 'success',
                        title: 'Thanh toán thành công',
                        text: 'Đơn hàng đã được thanh toán thành công!'
                    })
                }
            },
            error: function () {
                swal({
                    icon: 'info',
                    title: 'Thanh toán Thất bại!',
                    text: 'Hệ thống đang bảo trì, vui lòng quay lại sau!'
                })
            }
        });
}