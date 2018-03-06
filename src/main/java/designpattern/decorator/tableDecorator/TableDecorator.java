package designpattern.decorator.tableDecorator;


import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created by herenwei on 2018/3/6.
 */
public abstract class TableDecorator implements Table {

    private Table table;

    public TableDecorator(Table table) {
        this.table=table;
    }
}
