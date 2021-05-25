package com.itheima.controller;

import com.itheima.util.UploadUtils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class Fileload {
    @RequestMapping("/upload01")
    public String  fileUpload01(HttpServletRequest request) throws IOException {
        ServletInputStream inputStream = request.getInputStream();
        return "success";
    }
    @RequestMapping("/upload02")
    public String fileupload02(String desc, MultipartFile upload ,HttpServletRequest request) {
        //1.获取文件名
        String filename = upload.getOriginalFilename();
        //2.基于upload创建文件
        //2.1获取upload的绝对路径

        String realPath = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println(realPath);
        //2.2生成随机文件名
        String uuidName = UploadUtils.getUUIDName(filename);
        //2.3生成2级目录
        String dir = UploadUtils.getDir();
        File file = new File(realPath, dir);
        if (!file.exists()){
            file.mkdirs();
        }
        try {
            upload.transferTo(new File(file,uuidName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "success";
    }
    @RequestMapping("/upload03")
    public String fileUpload03(MultipartFile upload){
        try {
            String filename = upload.getOriginalFilename();
            String uuidName = UploadUtils.getUUIDName(filename);
            Client client = new Client();
            WebResource resource = client.resource("http://192.168.44.77:8081/files/"+uuidName);
            resource.put(upload.getBytes());
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "success";
        }
    }
}