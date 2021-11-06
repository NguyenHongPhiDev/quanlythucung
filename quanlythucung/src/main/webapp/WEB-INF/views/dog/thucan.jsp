<div class="container-xl">
    <div class="row">
        <div class="col-md-12">
            <h2><b>Sản Phẩm</b></h2>
            <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="0">
                <div class="carousel-inner">
                    <div class="item carousel-item active  testimonial-group">
                        <div class="row itemScroll" >
                            <c:forEach var="item" items="${items}">
                            <div class="col-sm-3">
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
                                    <div class="thumb-content">
                                        <h4>${item.prodName}</h4>
                                        <div class="star-rating">
                                            <ul class="list-inline">
                                                <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                <li class="list-inline-item"><i class="fa fa-star"></i></li>
                                                <li class="list-inline-item"><i class="fa fa-star-o"></i></li>
                                            </ul>
                                        </div>
                                        <p class="item-price"><strike>${item.price+200}</strike> <b>${item.price}</b></p>
                                        <button onclick="addItem(${item.idProd})" class="btn btn-primary">Add to Cart</button>
                                    </div>
                                </div>
                            </div>
                            </c:forEach>
                        </div>
                    </div>
                </div>
                <!-- Carousel controls -->
                <a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
                    <i class="fa fa-angle-left"></i>
                </a>
                <a class="carousel-control-next" href="#myCarousel" data-slide="next">
                    <i class="fa fa-angle-right"></i>
                </a>
            </div>
        </div>
    </div>
</div>