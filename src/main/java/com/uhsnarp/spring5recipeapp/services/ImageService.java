package com.uhsnarp.spring5recipeapp.services;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    void saveImageFile(Long valueOf, MultipartFile file);
}