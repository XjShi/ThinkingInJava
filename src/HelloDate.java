/**
 * Created by xjshi on 02/03/2017.
 */
public class HelloDate {
    public static void main(String[] args) {
        Dog d1 = new Dog("spot", "ruff");
        Dog d2 = new Dog("scruffy", "surf");
        System.out.println(d1);
        System.out.println(d2);

    }
}

class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("name:\t");
        buffer.append(name);
        buffer.append("\n");
        buffer.append("says:");
        buffer.append(says);
        buffer.append("\n");
        return buffer.toString();
    }
}