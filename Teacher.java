package com.design.pattern.prototype;

import com.design.pattern.Profession;

public class Teacher implements Profession {

    @Override
    public void print() {
        System.out.println("Teacher Profession");
    }
}
