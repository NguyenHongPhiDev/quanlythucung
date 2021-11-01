function addItem(e){
    var url = "http://localhost:8080/quanlythucung"+"/cart/add/"+e;
    $.ajax({
        url: url,
        type: "POST",
        success: function () {
                alert("Thêm sản phẩm thành công!");
            console.log("thành công");
        },
        error: function () {
            alert("Thêm sản phẩm thất bại!")
        }
    });
}
$(document).ready(function(){
    $(".wish-icon i").click(function(){
        $(this).toggleClass("fa-heart fa-heart-o");
    });
    $(".carousel-control-prev").click(function(){
        var actualScroll = $(".itemScroll").scrollLeft();
        $(".itemScroll").scrollLeft(actualScroll-350)
    })
    $(".carousel-control-next").click(function(){
        var actualScroll = $(".itemScroll").scrollLeft();
        $(".itemScroll").scrollLeft(actualScroll+350)
    })
});
