package designpattern.strategy.SpringStrategy;

/**
 * Created by herenwei on 2018/6/22.
 * Object 可以是任何东西
 */
public interface MyStrategy extends IStrategy<Object> {

    void doSomething();
}
