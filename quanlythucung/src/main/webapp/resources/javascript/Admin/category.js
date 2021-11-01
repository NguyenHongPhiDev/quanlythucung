$(document).ready(function(){
});
function change(e){
        $('#idCat_').val(e.value.split(";")[0]);
        $('#catName_').val(e.value.split(";")[1]);
}
