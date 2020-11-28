package com.design.pattern.singleton;

public class SingletonDemo {

    public static void main(String[] args) {

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();

        System.out.println("singletonEager1 = " + singletonLazy);
        System.out.println("singletonLazy2 = " + singletonLazy2);


        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager2 = SingletonEager.getInstance();

        System.out.println("singletonEager1 = " + singletonEager);
        System.out.println("singletonLazy2 = " + singletonEager2);
    }
}
