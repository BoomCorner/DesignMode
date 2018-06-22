package designpattern.proxy.car;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by herenwei on 2018/3/8.
 */
public class TimeHandler implements InvocationHandler {
    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶…");
        method.invoke(target, args);
        long stopTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶…汽车行驶时间：" + (stopTime - startTime) + "毫秒！");
        return null;
    }

}

