package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

public class TraineeTeacher implements Profession {

    @Override
    public void print() {
        System.out.println("Trainee Teacher Profession");
    }
}
