package exceptions;

/**
 * Created by xjshi on 13/03/2017.
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace())
                System.out.println(ste.getMethodName());
        }
    }
    static void g() {
        f();
    }
    static void h() {
        g();
    }

    public static void main(String[] args) {
        g();
    }
}
