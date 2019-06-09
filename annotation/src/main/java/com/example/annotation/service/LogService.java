package com.example.annotation.service;

import com.example.annotation.annotations.LogOperator;
import org.springframework.stereotype.Service;

@Service
public class LogService {

    @LogOperator(desc = "获取")
    public void get() {
        System.out.println("get");
    }

    @LogOperator(desc = "新建")
    public void post() {
        System.out.println("post");
    }

    @LogOperator(desc = "删除")
    public void delete() {
        System.out.println("delete");
    }

    @LogOperator(desc = "更新")
    public void put() {
        System.out.println("put");
    }
}
