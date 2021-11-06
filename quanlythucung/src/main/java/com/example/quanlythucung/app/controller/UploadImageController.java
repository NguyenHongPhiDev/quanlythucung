package com.example.quanlythucung.app.controller;

import com.example.quanlythucung.domain.common.image.UploadImage;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.inject.Inject;

@RequestMapping("/image")
@Controller
public class UploadImageController {
    @Inject
    UploadImage uploadFile;
    @ResponseBody
    @RequestMapping(value = "/upload",method = {RequestMethod.POST,RequestMethod.GET},consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadImage(@RequestParam("img") MultipartFile file){
        String name = uploadFile.uploadFile(file);
        System.out.println(name);
        return name;
    }
}
