package containers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 04/06/2017.
 */
public class CountedString {
    private static List<String> created = new ArrayList<String>();
    private String s;
    private int id = 0; //CountedString中s使用的次数

    public CountedString(String s) {
        this.s = s;
        created.add(s);
        for (String s2 :
                created) {
            if (s2.equals(s))
                id++;
        }
    }

    @Override
    public String toString() {
        return "String: " + s + " id: " + id + " hashCode(): " + hashCode();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + s.hashCode();
        result = 37 * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CountedString &&
                s.equals(((CountedString) obj).s) &&
                id == ((CountedString)obj).id;
    }

    public static void main(String[] args) {
        Map<CountedString, Integer> map= new HashMap<CountedString, Integer>();
        CountedString[] countedStrings = new CountedString[5];
        for (int i = 0; i < countedStrings.length; i++) {
            countedStrings[i] = new CountedString("hi");
            map.put(countedStrings[i], i);
        }
        print(map);
        for (CountedString cstring :
                countedStrings) {
            print("Looking up " + cstring);
            print(map.get(cstring));
        }
    }
}
