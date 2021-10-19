$.fn.digits = function(){ 
	return this.each(function(){ 
		$(this).text( $(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,") ); 
	})
}


//Get baseUrl for call ajax
function getBaseUrl(){
    return "/" + window.location.pathname.split("/")[1];
}

function saveSourceURLAndPreviousURL() {
	var sourceURL = sessionStorage.getItem("sourceURL");
	sessionStorage.setItem("previousURL", sourceURL);
	sessionStorage.setItem("sourceURL", document.location.href);
}

function acceptLanguage(){
	if(navigator.language == 'en'){
		return 'en';
	}
	return 'jp';
} 


function scrollFunction() {
    //Get the button
    let backToTopBtn = document.getElementById("backToTopBtn");
    if(document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
        backToTopBtn.style.display = "block";
    } else {
        backToTopBtn.style.display = "none";
    }
}

//Go to the top of the web page
function backToTop() {
    document.body.scrollTop = 0;
    document.documentElement.scrollTop = 0;
}


// For hide dismis instread of remove
$(function(){
    $("[data-hide]").on("click", function(){
        $("." + $(this).attr("data-hide")).hide();
    });
});

// Process Local Storage
function deleteItemStorage(key) {
    localStorage.removeItem(key);
}
function saveItemStorage(key, value) {
    localStorage.setItem(key, JSON.stringify(value));
}
function getItemStorage(key, processFnc) {
    var value = localStorage.getItem(key);
    if(value == null || value.trim() == '') {
        return null;
    }
    var result = JSON.parse(value);
    if(processFnc != undefined) {
        return processFnc(result);
    }
    return result;
}