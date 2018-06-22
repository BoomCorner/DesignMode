package designpattern.strategy.SpringStrategy;

import org.springframework.stereotype.Service;

/**
 * Created by herenwei on 2018/6/22.
 */
@Service
public class MyStrategy1Impl implements MyStrategy {
    @Override
    public void doSomething() {
        //do something
    }

    @Override
    public Object getCondition() {
        return null;
    }
}
