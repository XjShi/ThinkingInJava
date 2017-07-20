package innerclasses;

/**
 * Created by xjshi on 03/03/2017.
 */
public class DotNew {
    public class Inner {
        public Inner() {
            System.out.println("Inner constructor");
        }
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner in = dn.new Inner();
    }
}
