package designpattern.proxy.car;

import java.util.Random;

/**
 * Created by herenwei on 2018/3/8.
 */
public class Car implements Moveable {

    public Car() {
        System.out.println("car11111111");
    }

    @Override
    public void move() throws Exception {
        Thread.sleep(new Random().nextInt(1000));
        System.out.println("汽车行驶中…");
    }
}
