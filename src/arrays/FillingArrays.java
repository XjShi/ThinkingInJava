package arrays;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 03/06/2017.
 */
public class FillingArrays {
    public static void main(String[] args) {
        int[] a = new int[6];
        Arrays.fill(a, 333);
        print("a: " + Arrays.toString(a));
    }
}
