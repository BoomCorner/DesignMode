package designpattern.strategy.SpringStrategy.facade;

import designpattern.strategy.SpringStrategy.IStrategy;
import designpattern.strategy.SpringStrategy.MyStrategy;
import designpattern.strategy.SpringStrategy.container.IStrategyContainer;
import designpattern.strategy.SpringStrategy.container.StrategyContainerImpl;
import org.springframework.stereotype.Service;

/**
 * Created by herenwei on 2018/6/22.
 */
@Service
public class FacadeImpl implements IFacade {
    private IStrategyContainer<Object, MyStrategy> container = new StrategyContainerImpl<Object, MyStrategy>() {
    };

    @Override
    public void facade() {
        MyStrategy strategy = container.getStrategy("condition");
        strategy.doSomething();

    }
}
