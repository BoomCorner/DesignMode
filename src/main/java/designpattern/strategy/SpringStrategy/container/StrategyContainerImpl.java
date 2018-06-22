package designpattern.strategy.SpringStrategy.container;

import designpattern.strategy.SpringStrategy.IStrategy;
import designpattern.strategy.SpringStrategy.SpringBeanFactory;
import org.springframework.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by herenwei on 2018/6/22.
 */
@Service
public class StrategyContainerImpl<C, S extends IStrategy<C>> implements IStrategyContainer<C, S> {

    private final Map<C, S> strategyMap = new HashMap<C, S>();

    public synchronized void initStrategy() {
        if (!strategyMap.isEmpty()) {
            return;
        }
        Type genericSuperclass = this.getClass().getGenericSuperclass();
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        Class strategyClass = (Class) actualTypeArguments[1];
        Map<String, S> beans = SpringBeanFactory.getBeans(strategyClass);
        if (beans != null && !beans.isEmpty()) {
            for (S s : beans.values()) {
                strategyMap.put(s.getCondition(), s);
            }
        }
    }

    @Override
    public S getStrategy(C c) {
        if (strategyMap.isEmpty()) {
            initStrategy();
        }

        return strategyMap.get(c);
    }

}
