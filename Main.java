package com.design.pattern.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
            ProfessionCache.loadProfessionCache();

            Profession profession = ProfessionCache.getCloneNewObject(1);
            profession.print();
            System.out.println("profession = " + profession);

            Profession profession2 = ProfessionCache.getCloneNewObject(2);
            profession2.print();
            System.out.println("profession2 = " + profession2);

            Profession profession3 = ProfessionCache.getCloneNewObject(1);
            profession3.print();
            System.out.println("profession = " + profession3);
    }
}
