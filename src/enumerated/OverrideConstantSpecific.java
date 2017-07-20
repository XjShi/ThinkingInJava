package enumerated;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

/**
 * Created by xjshi on 04/06/2017.
 */
public enum  OverrideConstantSpecific {
    NOT,
    BOLT,
    WASHER {
        void f() {
            print("Overridden method");
        }
    };
    void f() {
        print("default behaviour");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs :
                values()) {
            printnb(ocs + ": ");
            ocs.f();
        }
    }
}
