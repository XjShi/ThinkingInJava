package exceptions;

/**
 * Created by xjshi on 13/03/2017.
 */
public class Practice1 {
    public static void main(String[] args) {
        try {
            throw new Exception("what happend?");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            System.out.println("finally");
        }
    }
}
