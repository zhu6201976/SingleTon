package com.example.javatest;

/**
 * 单例模式
 * Created by My on 2018/1/15.
 */

public class SingleTon {
    // 3.恶汉式，直接创建对象
    private static SingleTon singleTon = new SingleTon();

    // 1.构造方法私有化
    private SingleTon() {

    }

    // 2.提供一个外部访问接口
    public static SingleTon getInstance() {
        return singleTon;
    }

    // 类中方法
    public void method() {
        System.out.println("method");
    }
}
/*public class SingleTon {
    // 3.懒汉式
    private static SingleTon singleTon;

    // 1.构造方法私有化
    private SingleTon() {

    }

    // 2.提供一个外部访问接口
    public static SingleTon getInstance() {
        if (singleTon == null){
            singleTon = new SingleTon();
        }
        return singleTon;
    }

    // 类中方法
    public void method() {
        System.out.println("method");
    }
}*/
