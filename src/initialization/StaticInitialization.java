package initialization;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 01/06/2017.
 */
class Bowl {
    Bowl(int marker) {
        print("Bowl(" + marker + ")");
    }

    void f1(int marker) {
        print("f1(" + marker + ")");
    }
}

class Table {
    static void test() {
        System.out.println("test");
    }
    static {
        System.out.println("before bowl1");
    }
    static Bowl bowl1 = new Bowl(1);
    static {
        System.out.println("after bowl1");
    }

    Table() {
        print("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        print("f2(" + marker + ")");
    }

    static {
        System.out.println("before bowl2");
    }
    static Bowl bowl2 = new Bowl(2);
    static {
        System.out.println("after bowl2");
    }
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    Cupboard() {
        print("Cupboard");
        bowl4.f1(2);
    }

    void f3(int marker) {
        print("f3(" + marker + ")");
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
//        print("----------------------");
//        new Cupboard();
//        print("======================");
//        new Cupboard();
//        table.f2(1);
//        cupboard.f3(1);
        Table.test();
    }

//    static Table table = new Table();
//    static Cupboard cupboard = new Cupboard();
}
