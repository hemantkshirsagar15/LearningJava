package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

public class TraineeFactory extends AbstractFactoryProducer{

    @Override
     public Profession getProfession(String typeOfProfession){
        if(typeOfProfession == null){
            return null;
        }
        if("Engineer".equalsIgnoreCase(typeOfProfession)){
            return new TraineeEngineer();
        } else if("Doctor".equalsIgnoreCase(typeOfProfession)){
            return new TraineeDoctor();
        } else if("Teacher".equalsIgnoreCase(typeOfProfession)){
            return new TraineeTeacher();
        }
        return null;
    }
}
