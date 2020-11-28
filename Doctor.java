package com.design.pattern.factory;

import com.design.pattern.Profession;

public class Doctor implements Profession {
    @Override
    public void print() {
        System.out.println("Doctor Profession");
    }
}
