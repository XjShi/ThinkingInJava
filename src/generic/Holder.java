package generic;

/**
 * Created by xjshi on 03/06/2017.
 */
public class Holder<T> {
    private T value;

    public Holder(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> apple = new Holder<Apple>(new Apple());
        Apple d = apple.get();
//        Holder<Fruit> fruit = apple;
        Holder<? extends Fruit> fruit = apple;
        Fruit p = fruit.get();
        d = (Apple) fruit.get();
    }
}
