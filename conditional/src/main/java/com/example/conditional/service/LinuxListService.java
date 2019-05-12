package com.example.conditional.service;

public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
