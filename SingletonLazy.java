package com.design.pattern.singleton;

public class SingletonLazy {

    private static final SingletonLazy singletonInstance = new SingletonLazy();

    private SingletonLazy(){}

    public static SingletonLazy getInstance(){
        return singletonInstance;
    }
}
