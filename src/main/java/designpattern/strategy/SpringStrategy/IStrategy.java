package designpattern.strategy.SpringStrategy;

/**
 * Created by herenwei on 2018/6/22.
 */
public interface IStrategy<C> {
    /**
     * 获得策略条件
     *
     * @return 用来注册的策略处理条件
     */
    C getCondition();

}
