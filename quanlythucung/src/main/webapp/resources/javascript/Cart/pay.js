function thanhToan(){
    var url = "http://localhost:8080/quanlythucung/cart/pay/";
        $.ajax({
            url: url,
            type: "POST",
            success: function (response) {
                if(response=='0'){
                    window.location = "http://localhost:8080/quanlythucung/login"
                }
                if(response=='1'){
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
                    title: 'Nạp thẻ Thất bại!',
                    text: 'Hệ thống đang bảo trì, vui lòng quay lại sau!'
                })
            }
        });
}