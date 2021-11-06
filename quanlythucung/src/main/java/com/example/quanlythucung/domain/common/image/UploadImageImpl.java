package com.example.quanlythucung.domain.common.image;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

@Service
public class UploadImageImpl implements UploadImage {
    @Override
    public String uploadFile(MultipartFile file){
        if(null!= file && !file.isEmpty()){
            try {
                byte[] bytes = file.getBytes();
                String rootPath = System.getProperty("catalina.home");
                File dir = new File(rootPath+ File.separator + "assets/user/images");
                if (!dir.exists())
                    dir.mkdirs();
                String name = String.valueOf(new Date().getTime()+".jpg");
                File serverFile = new File(dir.getAbsolutePath()
                        + File.separator + name);
                System.out.println("=================" +serverFile.getPath());
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(serverFile));
                stream.write(bytes);
                stream.close();
//                return serverFile.getPath();
                return name;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("==================");
        }
        return null;
    }
}
