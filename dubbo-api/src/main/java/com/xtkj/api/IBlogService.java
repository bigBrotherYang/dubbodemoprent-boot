package com.xtkj.api;

import com.xtkj.pojo.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findBlogs();
}
