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
    $("#teamPrev1").click(function(){
        var actualScroll = $("#team1").scrollLeft();
        $("#team1").scrollLeft(actualScroll-350)
    })
    $("#teamNext1").click(function(){
        var actualScroll = $("#team1").scrollLeft();
        $("#team1").scrollLeft(actualScroll+350)
    })
    $("#teamPrev2").click(function(){
        var actualScroll = $("#team2").scrollLeft();
        $("#team2").scrollLeft(actualScroll-350)
    })
    $("#teamNext2").click(function(){
        var actualScroll = $("#team2").scrollLeft();
        $("#team2").scrollLeft(actualScroll+350)
    })
    $("#teamPrev3").click(function(){
        var actualScroll = $("#team3").scrollLeft();
        $("#team3").scrollLeft(actualScroll-350)
    })
    $("#teamNext3").click(function(){
        var actualScroll = $("#team3").scrollLeft();
        $("#team3").scrollLeft(actualScroll+350)
    })
    $("#teamPrev4").click(function(){
        var actualScroll = $("#team4").scrollLeft();
        $("#team4").scrollLeft(actualScroll-350)
    })
    $("#teamNext4").click(function(){
        var actualScroll = $("#team4").scrollLeft();
        $("#team4").scrollLeft(actualScroll+350)
    })
});
