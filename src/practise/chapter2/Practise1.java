package practise.chapter2;

/**
 * Created by xjshi on 01/06/2017.
 */
public class Practise1 {
    char c;
    int i;
    String s;

    public static void main(String[] args) {
        Practise1 practise1 = new Practise1();
        System.out.println("value\n" + Character.toString(practise1.c) + "\n" + Integer.toString(practise1.i) + "\n" + practise1.s);
    }

    void foo() {
        int cnt = 0;
        cnt++;
    }
}
