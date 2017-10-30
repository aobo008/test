package com.test.design_pattern.structure.adapter;

/**
 * Created by wanggy on 2017/10/26.
 *
 * 适配器模式优点：
     将目标类和适配者类解耦，通过引入一个适配器类来重用现有的适配者类，无须修改原有结构。
     增加了类的透明性和复用性，将具体的业务实现过程封装在适配者类中，对于客户端类而言是透明的，而且提高了适配者的复用性，同一个适配者类可以在多个不同的系统中复用。
     灵活性和扩展性都非常好，可以很方便地更换适配器。
     一个对象适配器可以把多个不同的适配者适配到同一个目标。
     可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据“里氏代换原则”，适配者的子类也可通过该适配器进行适配。

    适配器模式缺点：
     类适配器模式对于不支持多重类继承的语言，一次最多只能适配一个适配者类，不能同时适配多个适配者。
     适配者类不能为最终类，如在Java中不能为final类。
     在Java中，类适配器模式中的目标抽象类只能为接口，不能为类，其使用有一定的局限性。
     对象适配器要在适配器中置换适配者类的某些方法比较麻烦。

     适配器模式应用场景：
         java.io.InputStreamReader(InputStream)
         java.io.OutputStreamWriter(OutputStream)
 */
public class AdapterClient {
    public static void main(String[] args){
        Target target = new AdapterTarget(new Bird());
        target.Fly();
    }
}
