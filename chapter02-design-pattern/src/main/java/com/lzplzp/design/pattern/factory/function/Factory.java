package com.lzplzp.design.pattern.factory.function;

import com.lzplzp.design.pattern.factory.Milk;

/**
 * 工厂方法
 *
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:14
 */
public interface Factory {

    Milk getMilk();
}
