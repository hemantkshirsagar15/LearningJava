package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("===========================Trainee Factory Creation================================");
        AbstractFactoryProducer factoryProducer = AbstractFactoryProducer.getFactory(true);

        Profession engineer = factoryProducer.getProfession("Engineer");
        engineer.print();

        Profession doctor = factoryProducer.getProfession("Doctor");
        doctor.print();

        Profession teacher = factoryProducer.getProfession("Teacher");
        teacher.print();

        System.out.println("==========================Professional Factory Creation==============================");
        AbstractFactoryProducer professionalFactoryProducer = AbstractFactoryProducer.getFactory(false);

        Profession professionalEngineer = professionalFactoryProducer.getProfession("Engineer");
        professionalEngineer.print();

        Profession professionalDoctor = professionalFactoryProducer.getProfession("Doctor");
        professionalDoctor.print();

        Profession professionalTeacher = professionalFactoryProducer.getProfession("Teacher");
        professionalTeacher.print();


    }
}
