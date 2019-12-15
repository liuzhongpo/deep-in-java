package com.lzplzp.design.pattern.factory.simple;

import com.lzplzp.design.pattern.factory.Milk;
import com.lzplzp.design.pattern.factory.TeLunSu;
import com.lzplzp.design.pattern.factory.Yili;

/**
 * 简单工厂
 *
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:11
 */
public class SimpleFactory {

    public Milk getMilk(String milkName) {
        if("特仑苏".equals(milkName)) {
            return new TeLunSu();
        }else if("伊利".equals(milkName)) {
            return new Yili();
        }
        return null;
    }
}
