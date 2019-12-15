package com.lzplzp.design.pattern.factory.abstarct;

import com.lzplzp.design.pattern.factory.Milk;
import com.lzplzp.design.pattern.factory.function.TeLunSuFactory;
import com.lzplzp.design.pattern.factory.function.YiLiFactory;

/**
 * @author thinking
 * @projectName deep-in-java
 * @date 2019/12/15 11:18
 */
public class MilkFactory extends AbsractFactory {
    Milk getTeLunSu() {
        return new TeLunSuFactory().getMilk();
    }
    Milk getYiLi() {
        return new YiLiFactory().getMilk();
    }
}
