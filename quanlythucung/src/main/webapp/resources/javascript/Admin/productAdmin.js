$(document).ready(function(){
});
function change(e){
        $('#idProd_').val(e.value.split(";")[0]);
        $('#prodName_').val(e.value.split(";")[1]);
        $('#idCat_').val(e.value.split(";")[2]);
        $('#price_').val(e.value.split(";")[3]);
        $('#quantity_').val(e.value.split(";")[4]);
        $('#urlImage1').val(e.value.split(";")[5]);
}
