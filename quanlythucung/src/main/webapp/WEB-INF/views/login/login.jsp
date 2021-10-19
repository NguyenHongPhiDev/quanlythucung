

<!-- Basic -->
<div class="ex-form-1 pt-5 pb-5">
    <div class="container">
        <div class="row">
            <div class="col-xl-6 offset-xl-3">
                <div class="text-box mt-5 mb-5">
                    <p class="mb-4">You don't have a password? Then please <a class="blue" href="sign-up.html">Sign Up</a></p>

                    <!-- Log In Form -->
                    <form:form action="${f:h(pageContext.request.contextPath)}/login">
                        <div class="mb-4 form-floating">
                            <input type="text" class="form-control" id="username" name="username" placeholder="name@example.com">
                            <label for="username">User Name</label>
                        </div>
                        <div class="mb-4 form-floating">
                            <input type="password" class="form-control" id="password" name="password" placeholder="Password">
                            <label for="password">Password</label>
                        </div>
                        <div class="mb-4 form-check">
                            <input type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">I agree with the site's stated <a href="privacy.html">Privacy Policy</a> and <a href="terms.html">Terms & Conditions</a></label>
                        </div>
                        <button type="submit" class="form-control-submit-button">Log in</button>
                    </form:form>
                    <!-- end of log in form -->

                </div> <!-- end of text-box -->
            </div> <!-- end of col -->
        </div> <!-- end of row -->
    </div> <!-- end of container -->
</div> <!-- end of ex-basic-1 -->