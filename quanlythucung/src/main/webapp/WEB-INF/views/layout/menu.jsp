<nav id="navbarExample" class="navbar navbar-expand-lg fixed-top navbar-light" aria-label="Main navigation">
    <div class="container">

        <!-- Image Logo -->
        <a class="navbar-brand logo-image" href="index"><img src="${pageContext.request.contextPath}/resources/images/logo.jpg" alt="alternative"></a>

        <!-- Text Logo - Use this if you don't have a graphic logo -->
        <!-- <a class="navbar-brand logo-text" href="index.html">Ioniq</a> -->

        <button class="navbar-toggler p-0 border-0" type="button" id="navbarSideCollapse" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse offcanvas-collapse" id="navbarsExampleDefault">
            <ul class="navbar-nav ms-auto navbar-nav-scroll">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#header">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#features">Features</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#details">Details</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#pricing">Pricing</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-bs-toggle="dropdown" aria-expanded="false">Drop</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown01">
                        <li><a class="dropdown-item" href="article.html">Article Details</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="terms.html">Terms Conditions</a></li>
                        <li><div class="dropdown-divider"></div></li>
                        <li><a class="dropdown-item" href="privacy.html">Privacy Policy</a></li>
                    </ul>
                </li>
            </ul>
            <sec:authorize access="!isAuthenticated()">
                <span class="nav-item">
                            <a class="btn-outline-sm" href="login">Log in</a>
                </span>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <a href="${pageContext.request.contextPath}/store/member/update" class="btn btn-title">
                <sec:authentication var="user" property="principal" />
                    Xin chào ${user.username}
                </a>
            </sec:authorize>
        </div> <!-- end of navbar-collapse -->
    </div> <!-- end of container -->
</nav> <!-- end of navbar -->
<!-- end of navigation -->
<header id="header" class="header">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="text-container">
                    <h1 class="h1-large">The #1 CRM app for <span class="replace-me">small business, young startups, bootstrappers</span></h1>
                    <p class="p-large">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut dignissim, neque ut vanic barem ultrices sollicitudin</p>
                    <a class="btn-solid-lg" href="sign-up.html">Sign up for free</a>
                </div> <!-- end of text-container -->
            </div> <!-- end of col -->
        </div> <!-- end of row -->
    </div> <!-- end of container -->
</header> <!-- end of header -->
<!-- end of header -->