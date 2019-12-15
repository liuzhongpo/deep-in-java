package com.lzplzp.design.pattern.factory.simple;

/**
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:12
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getMilk("特仑苏"));
    }
}
