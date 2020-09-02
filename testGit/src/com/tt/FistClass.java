package com.tt;

import java.util.ArrayList;
import java.util.List;

public class FistClass {
    public static void main(String[] args) {
        System.out.println("你好哇");
        List<String> list=new ArrayList<>();
        list.add("你好");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("buhaowan ");
    }
}

