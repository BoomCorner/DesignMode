package designpattern.strategy.SpringStrategy.container;

import designpattern.strategy.SpringStrategy.IStrategy;

/**
 * Created by herenwei on 2018/6/22.
 */
public interface IStrategyContainer<C, S extends IStrategy<C>> {
    /**
     * 获得处理策略
     *
     * @param condition 策略条件
     * @return 对应策略条件的策略
     */
    S getStrategy(final C condition);

}
