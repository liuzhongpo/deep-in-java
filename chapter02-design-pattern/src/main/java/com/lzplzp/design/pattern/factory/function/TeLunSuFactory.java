package com.lzplzp.design.pattern.factory.function;

import com.lzplzp.design.pattern.factory.Milk;
import com.lzplzp.design.pattern.factory.TeLunSu;

/**
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:15
 */
public class TeLunSuFactory implements Factory {
    public Milk getMilk() {
        return new TeLunSu();
    }
}
