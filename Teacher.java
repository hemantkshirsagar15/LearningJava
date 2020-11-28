package com.design.pattern.factory;

import com.design.pattern.Profession;

public class Teacher implements Profession {

    @Override
    public void print() {
        System.out.println("Teacher Profession");
    }
}
