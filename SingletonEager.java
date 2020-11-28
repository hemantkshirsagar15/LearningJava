package com.design.pattern.singleton;

public class SingletonEager {

    private static SingletonEager singletonEager = null;

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        if(singletonEager == null)
            singletonEager =  new SingletonEager();

        return singletonEager;
    }
}
