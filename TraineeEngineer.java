package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

public class TraineeEngineer implements Profession {
    @Override
    public void print() {
        System.out.println("Trainee Engineer Profession");
    }
}
