function napthe(){
    var url = "http://localhost:8080/quanlythucung/nap-the/send/";
    if($('#price').val()==='0'){
        swal({
            icon: 'error',
            title: 'Nạp thẻ thất bại!',
            text: 'Vui lòng chọn mệnh giá thẻ nạp!'
        })
    }else {
        var filterData = {
            price: $('#price').val(),
        }
        $.ajax({
            url: url,
            type: "POST",
            data: filterData,
            success: function (response) {
                const format = response.split(".")[0].replace(/\B(?=(\d{3})+(?!\d))/g, '.')
                swal({
                    icon: 'info',
                    title: 'Nạp thẻ Thành công',
                    text: 'Bạn đã nạp thành công ' + format + ' VNĐ vào tài khoản!'
                })
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
}