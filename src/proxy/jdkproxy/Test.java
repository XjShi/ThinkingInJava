package proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler handler = new TimeHandler(car);
        Class<?> cls = car.getClass();

        Moveable moveable = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), handler);
        moveable.move();
    }
}
