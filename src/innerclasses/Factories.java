package innerclasses;

/**
 * Created by xjshi on 02/06/2017.
 */
interface Service {
    void method1();
    void method2();
}

interface ServiceFactory {
    Service getService();
}

class Implemetation1 implements Service {
    private Implemetation1() {
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implemetation1();
        }
    };
}

class Implemetation2 implements Service {
    private Implemetation2() {
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }

    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implemetation2();
        }
    };
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }
    public static void main(String[] args) {
        serviceConsumer(Implemetation1.factory);
        serviceConsumer(Implemetation2.factory);
    }
}
