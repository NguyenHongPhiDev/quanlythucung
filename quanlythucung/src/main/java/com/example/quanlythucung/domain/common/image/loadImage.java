package com.example.quanlythucung.domain.common.image;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;

@WebServlet(urlPatterns = "/img/*")
public class loadImage extends HttpServlet {
    private String imagePath;

    @Override
    public void init() throws ServletException {
       imagePath = System.getProperty("catalina.home")+ File.separator+"assets"+ File.separator+"user"+ File.separator+"images";
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String requestImg = req.getPathInfo();

        if(requestImg == null){
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        File image = new File(imagePath, URLDecoder.decode(requestImg,"UTF-8"));
        if(!image.exists()){
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
        resp.reset();
        resp.setHeader("Content-Lenght",String.valueOf(image.length()));

        Files.copy(image.toPath(),resp.getOutputStream());
    }

}
