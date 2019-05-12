package com.example.conditional.service;

public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
