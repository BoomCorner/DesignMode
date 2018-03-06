package designpattern.decorator.tableDecorator;

/**
 * Created by herenwei on 2018/3/6.
 */
public class FlowerDecorator extends TableDecorator {

    public FlowerDecorator(Table table) {
        super(table);
        System.out.println("我是花装饰");
    }

}
