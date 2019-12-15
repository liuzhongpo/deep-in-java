package com.lzplzp.design.pattern.factory.abstarct;

/**
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:19
 */
public class MilkFactoryTest {

    public static void main(String[] args) {

        MilkFactory factory = new MilkFactory();

        System.out.println(factory.getTeLunSu());
        System.out.println(factory.getYiLi());

    }
}
