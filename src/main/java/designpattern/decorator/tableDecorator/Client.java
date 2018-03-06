package designpattern.decorator.tableDecorator;

/**
 * Created by herenwei on 2018/3/6.
 *
 * 参考 http://blog.csdn.net/cooldragon/article/details/52174157
 */
public class Client {
    public static void main(String[] args) {
        Table beautifulTable = new FlowerDecorator(new TableclothDecorator(new WoodTable()));
    }
}
