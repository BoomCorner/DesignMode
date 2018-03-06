package designpattern.decorator.tableDecorator;

/**
 * Created by herenwei on 2018/3/6.
 */
public class TableclothDecorator extends TableDecorator {

    public TableclothDecorator(Table table) {
        super(table);
        System.out.println("我是桌布");
    }

}
