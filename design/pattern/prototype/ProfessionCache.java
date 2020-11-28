package com.design.pattern.prototype;


import java.util.Hashtable;

public class ProfessionCache {

    private static Hashtable<Integer, Profession> professionCache = new Hashtable<>();

    static void loadProfessionCache(){
        Engineer  engineer = new Engineer();
        engineer.id= 1;
        professionCache.put(engineer.id, engineer);

        Doctor doctor = new Doctor();
        doctor.id= 2;
        professionCache.put(doctor.id, doctor);
    }

    public static  Profession getCloneNewObject(int id) throws CloneNotSupportedException {
        Profession profession = professionCache.get(id);
        return (Profession) profession.cloningMethod();
    }
}
