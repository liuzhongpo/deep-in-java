package com.lzplzp.design.pattern.factory.function;

/**
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:15
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factory = new TeLunSuFactory();
        System.out.println(factory.getMilk());
    }
}
