package com.example.quanlythucung.domain.common.image;

import org.springframework.web.multipart.MultipartFile;

public interface UploadImage {
    String uploadFile(MultipartFile file);
}
