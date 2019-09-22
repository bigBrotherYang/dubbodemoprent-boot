package com.xtkj.api.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.xtkj.api.IBlogService;
import com.xtkj.dao.BlogMapper;
import com.xtkj.pojo.Blog;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private BlogMapper blogMapper;
    @Override
    public List<Blog> findBlogs() {
        System.out.println("================================");
        return blogMapper.findBlogs();
    }
}
