package com.barbaros.singleton;

/**
 * Created by Bar-Mel on 1.09.2016.
 */
public class SingletonEager {
    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return instance;
    }
}
