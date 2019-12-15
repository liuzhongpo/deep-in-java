package com.lzplzp.design.pattern.factory.abstarct;

import com.lzplzp.design.pattern.factory.Milk;

/**
 * 抽象工厂
 *
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:17
 */
public abstract class AbsractFactory {

    abstract Milk getTeLunSu();

    abstract Milk getYiLi();

}
