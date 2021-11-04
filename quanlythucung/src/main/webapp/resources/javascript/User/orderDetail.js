function showDetails(item){
    var el;
    el =            '<tr>' +
        '                        <td><strong>'+item.idOrdDetail+'</strong></td>' +
        '                        <td>'+item.product.prodName+'</td>' +
        '                        <td>'+item.product.categories.catName+'</td>' +
        '                        <td>'+item.quantity+'</td>' +
        '                        <td>'+item.unitPrice+'</td>' +
        '                        <td>'+item.quantity*item.unitPrice+' VNĐ</td>' +
        '           </tr>'
    $("#message").append(el);
}
function clearMessage(){
    $("#message").empty();
}
function detail(e){
    var url = "http://localhost:8080/quanlythucung"+"/account/history/"+e;
    $.ajax({
        url: url,
        type: "POST",
        success: function (data) {
            console.log(data)
            clearMessage();
            data.forEach(showDetails)
        },
        error: function () {
            alert("Xem chi tết thất bại!")
        }
    });
}