package com.test.design_pattern.creative.builder;

/**
 * Created by wanggy on 2017/10/27.
 *
 * 建造者模式优点：
         建造者模式中，客户端不必知道产品内部组成的细节，将产品本身与产品的创建过程解耦，使得相同的创建过程可以创建不同的产品对象。
         每一个具体建造者都相对独立，而与其他的具体建造者无关，因此可以很方便地替换具体建造者或增加新的具体建造者，用户使用不同的具体建造者即可得到不同的产品对象。由于指挥者类针对抽象建造者编程，增加新的具体建造者无须修改原有类库的代码，系统扩展方便，符合“开闭原则”。
         可以更加精细地控制产品的创建过程。将复杂产品的创建步骤分解在不同的方法中，使得创建过程更加清晰。

    建造者模式缺点：
         建造者模式所创建的产品具有较多的共同点，其组成部分相似，如果产品之间的差异性很大，不适合使用建造者模式，因此其使用范围受到一定的限制。
         如果产品的内部变化复杂，可能会导致需要定义很多具体建造者类来实现这种变化，导致系统变得很庞大，增加系统的理解难度和运行成本。

    应用场景：
        如果一个对象的构建很复杂，需要很多步骤，则考虑使用建造者模式，把对象的构建和最后的组装分离开来。
         在平常使用的类中如果后缀为builder则就是建造者模式
         StringBuilder类的apend方法
         SQL中的PreparedStatement
         JDOM中的DomBuilder、SAXBuilder

 */
public class BuilderClient {
    public static void main(String[] args){
        Direct direct = new Direct();
        Product product = direct.getHighLevelProduct();
        product.show();

        product = direct.getLowLevelProduct();
        product.show();

    }
}
