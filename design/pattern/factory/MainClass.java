package com.design.pattern.factory;

import com.design.pattern.Profession;

public class MainClass {

    public static void main(String[] args) {
        Profession engineer = FactoryProducer.getProfession("Engineer");
        engineer.print();

        Profession doctor = FactoryProducer.getProfession("Doctor");
        doctor.print();

        Profession teacher = FactoryProducer.getProfession("Teacher");
        teacher.print();
    }
}
