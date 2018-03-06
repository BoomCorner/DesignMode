package designpattern.decorator.base;

import java.io.*;

/**
 * 装饰模式客户端调用代码，装饰的过程更像是层层包装，用前面的对象装饰后面的对象
 *
 * @author liu yuning
 */
public class DecoratorClient {
    public static void main(String[] args) throws FileNotFoundException {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
        ConcreteDecoratorB concreteDecoratorB = new ConcreteDecoratorB();
        ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC();

        concreteDecoratorA.setComponent(concreteComponent);
        concreteDecoratorA.operation();

        concreteDecoratorB.setComponent(concreteDecoratorA);
        concreteDecoratorB.operation();

        concreteDecoratorC.setComponent(concreteDecoratorB);
        concreteDecoratorC.operation();


        Closeable a = new FileInputStream("");

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("")));

    }
}
