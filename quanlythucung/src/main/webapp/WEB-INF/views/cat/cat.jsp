<div class="container-xl">
    <div class="row">
        <div class="col-md-12">
            <h2><b>${category}</b></h2>
            <div id="myCarousel" class="carousel " data-ride="carousel" data-interval="0">
                <div class="carousel-inner">
                    <div class="item carousel-item active ">
                        <div class="row itemScroll" >
                            <c:forEach var="item" items="${items}">
                                <div class="col-sm-3 mt-4">
                                    <div class="thumb-wrapper">
                                        <span class="wish-icon"><i class="fa fa-heart-o"></i></span>
                                        <c:if test="${item.urlImage!=null}">
                                            <div class="img-box">
                                                <img multiple width="100%" height="100%" src="${pageContext.request.contextPath}/img/${item.urlImage}" class="img-fluid p-2" alt="">
                                            </div>
                                        </c:if>
                                        <c:if test="${item.urlImage==null || item.urlImage==' '}">
                                            <div class="img-box">
                                                <img multiple src="${pageContext.request.contextPath}/img/no_image.jpg" class="img-fluid" alt="">
                                            </div>
                                        </c:if>
                                        <p class="text-center" style="white-space: nowrap;width: 100%; overflow: hidden;text-overflow: ellipsis;">${item.prodName}</p>
                                        <div class="thumb-content">
                                            <div class="star-rating">
                                                <ul class="list-inline">
                                                    <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                    <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                    <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                    <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                    <li class="list-inline-item"><i class="fa fa-star-o"></i></li>
                                                </ul>
                                            </div>
                                            <p class="item-price"><strike><fmt:formatNumber value="${item.price+item.price*30/100}" minFractionDigits="0" maxFractionDigits="0"/></strike><b><fmt:formatNumber value="${item.price}" minFractionDigits="0" maxFractionDigits="0"/> ₫</b></p>
                                            <button onclick="addItem(${item.idProd})" class="btn btn-primary">Thêm vào giỏ</button>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="pagination">
                            <t:pagination page="${page}"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>