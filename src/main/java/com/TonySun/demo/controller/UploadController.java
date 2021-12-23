package com.TonySun.demo.controller;

import com.TonySun.demo.model.ResultModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class UploadController {
    private String uploadPath = "/Users/apple/project/javademo/upload";

    @PostMapping("upload")
    public ResultModel upload(@RequestParam("file") MultipartFile file) {
        String filename = file.getOriginalFilename();
        Path savePath = Paths.get(uploadPath);
        try {
            Files.copy(file.getInputStream(), savePath.resolve(filename));
            return ResultModel.data("OK");
        } catch (IOException e) {
            return ResultModel.error("文件保存失败");
        }
    }
}
