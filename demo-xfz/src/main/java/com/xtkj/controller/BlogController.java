package com.xtkj.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xtkj.api.IBlogService;
import com.xtkj.pojo.Blog;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BlogController {
    @Reference(timeout = 10000)
    private IBlogService iBlogService;
    @ResponseBody
    @RequestMapping("blog/findBlogs")
    public List<Blog> getBlogs(){
        return iBlogService.findBlogs();
    }
}
