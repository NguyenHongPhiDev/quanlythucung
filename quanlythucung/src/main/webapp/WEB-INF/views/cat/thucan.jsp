<div class="container-xl">
    <div class="row">
        <div class="col-md-12">
            <h2>Featured <b>Products</b></h2>
            <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="0">
                <div class="carousel-inner">
                    <div class="item carousel-item active  testimonial-group">
                        <div class="row itemScroll" >
                            <c:forEach var="item" items="${items}">
                                <div class="col-sm-3">
                                    <div class="thumb-wrapper">
                                        <span class="wish-icon"><i class="fa fa-heart-o"></i></span>
                                        <div class="img-box">
                                            <img src="/examples/images/products/ipad.jpg" class="img-fluid" alt="">
                                        </div>
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