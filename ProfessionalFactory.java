package com.design.pattern.abstractfactory;

import com.design.pattern.Profession;

class ProfessionalFactory extends AbstractFactoryProducer{

    @Override
    public Profession getProfession(String typeOfProfession){
        if(typeOfProfession == null){
            return null;
        }
        if("Engineer".equalsIgnoreCase(typeOfProfession)){
            return new Engineer();
        } else if("Doctor".equalsIgnoreCase(typeOfProfession)){
            return new Doctor();
        } else if("Teacher".equalsIgnoreCase(typeOfProfession)){
            return new Teacher();
        }
        return null;
    }

}
