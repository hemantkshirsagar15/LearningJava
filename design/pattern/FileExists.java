package com.design.pattern;

import java.io.File;

public class FileExists {
    public static void main(String[] args) {
        File file = new File ("H:\\Hemant\\test\\dir");
        if(!file.exists())
            System.out.println(file.mkdirs());


    }
}
