package typeinfo.packageaccess;

import typeinfo.interface1.A;

/**
 * Created by xjshi on 04/06/2017.
 */
class C implements A {
    @Override
    public void f() {

    }

    public void g() {

    }

    void u() {

    }

    protected void v() {

    }

    private void w() {

    }
}

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}
