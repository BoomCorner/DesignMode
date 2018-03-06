package designpattern.decorator.tableDecorator;

/**
 * Created by herenwei on 2018/3/6.
 *
 * 参考 http://blog.csdn.net/cooldragon/article/details/52174157  装饰者模式
 *
 * 总结:
 *  装饰者模式:
 *  1.装饰者和被装饰者必须继承或者实现同一父类或接口
 *  2.装饰者需要有一个父类的属性(pubic Table table;)；
 *  3.一层层的实例化对象，将被装饰者装饰起来
 */
public class Client {
    public static void main(String[] args) {
        Table beautifulTable = new FlowerDecorator(new TableclothDecorator(new WoodTable()));
    }
}
