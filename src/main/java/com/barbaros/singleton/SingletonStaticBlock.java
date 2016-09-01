package com.barbaros.singleton;

/**
 * Created by Bar-Mel on 1.09.2016.
 */

public class SingletonStaticBlock {

    private static SingletonStaticBlock instance;
    private SingletonStaticBlock(){}

    static {
        try {
            instance = new SingletonStaticBlock();
        }catch (Exception e){
            throw new RuntimeException("Error");
        }
    }
    public static SingletonStaticBlock getInstance(){
        return instance;
    }
}
