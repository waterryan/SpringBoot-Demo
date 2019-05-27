package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

//@Controller
@RestController
public class FileUploadController {

    @PostMapping(value="/upload")
    public String upload(HttpServletRequest request,
                         @RequestParam("description") String description,
                         @RequestParam("file")MultipartFile file) throws Exception{

        System.out.println("====> FileUploadController");
        System.out.println("Description = " + description);

        if (!file.isEmpty()){
            String path = request.getServletContext().getRealPath("/upload/");

            System.out.println("path = " + path);

            String fileName = file.getOriginalFilename();
            File filePath = new File(path, fileName);
            if (!filePath.getParentFile().exists()){
                filePath.getParentFile().mkdirs();
            }

            // 保存到 /private/var/folders/7x/76rydky145sfdmn5jj_9gf180000gn/T/tomcat-docbase.5363872772494923544.8080/upload/
            //String savedPath = path + File.separator + fileName;
            String savedPath = "/Users/ryanrao/Desktop" + File.separator + fileName;  // 保存到桌面
            file.transferTo(new File(savedPath));
            System.out.println("path = " + savedPath);
            return "<b>Success!<b> " + description;
        } else {
            return "<b>Error!<b>";
        }

    }
}
