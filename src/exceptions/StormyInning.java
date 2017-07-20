package exceptions;

/**
 * Created by xjshi on 13/03/2017.
 * 12.9 异常的限制
 */
public class StormyInning extends Inning implements Storm {
    //构造方法可以添加新的异常，但是也必须处理基类构造方法的异常
    public StormyInning() throws BaseballException, RainedOut {
    }
    public StormyInning(String s) throws BaseballException, RainedOut {

    }

    //普通方法必须遵循基类
    @Override
    public void walk() {
        super.walk();
    }
//    public void walk() throws PopFoul {}

    //1.接口不能给在基类中存在的方法添加异常
    //2.尽管基类的方法由异常，但是你可以选择覆盖的方法不抛出
    @Override
    public void event() {

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void atBat() throws Strike, Foul {

    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }
}

class BaseballException extends Exception {

}

class Foul extends BaseballException {

}

class Strike extends BaseballException {

}

abstract class Inning {
    public Inning() throws BaseballException {

    }
    public void event() throws BaseballException {

    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
