package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

public class TraineeDoctor implements Profession {
    @Override
    public void print() {
        System.out.println("Trainee Doctor Profession");
    }
}
