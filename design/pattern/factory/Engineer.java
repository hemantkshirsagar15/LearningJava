package com.design.pattern.factory;

import com.design.pattern.Profession;

public class Engineer implements Profession {
    @Override
    public void print() {
        System.out.println("Engineer Profession");
    }
}
