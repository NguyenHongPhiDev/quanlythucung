function resetPassWord(){
    var url = "http://localhost:8080/quanlythucung/resetPassword/reset/";
    var filterData = {
        userName: $('#username').val(),
        email: $('#email').val()
    }
    $.ajax({
        url: url,
        type: "POST",
        data: filterData ,
        success: function (response) {
            console.log(response);
            let responseResult;
            if(response==='1'){
                responseResult="Tài khoản này chưa được đăng ký!"
            }else if(response ==='2'){
                responseResult = "Email đăng ký không chính xác!"
            }
            else {
                responseResult = "Mật khẩu mới của bạn là : " +response;
            }
            swal({
                icon: 'info',
                title: 'Mật khẩu mới',
                text: responseResult,
                footer: '<a href="">Copy</a>'
            })
        },
        error: function () {
            alert("Reset Mật khẩu thất bại!")
        }
    });
}