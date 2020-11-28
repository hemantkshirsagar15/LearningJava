package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

public abstract class AbstractFactoryProducer {

    abstract public Profession getProfession(String typeOfProfession);

    public static AbstractFactoryProducer getFactory(boolean isTrainee){
        if(isTrainee){
            return new TraineeFactory();
        }else {
            return new ProfessionalFactory();
        }
    }

}
