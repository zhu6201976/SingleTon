package com.example.javatest;

/**
 * 单例模式，恶汉式，懒汉式
 */
public class Test {

    public static void main(String[] args) {

        // 外部通过静态方法（类创建该实例对象）
        SingleTon singleTon1 = SingleTon.getInstance();
        singleTon1.method();

        // 比较是否同一个对象（地址）
        SingleTon singleTon2 = SingleTon.getInstance();
        System.out.println(singleTon1 == singleTon2);
    }


}
