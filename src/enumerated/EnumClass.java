package enumerated;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 16/03/2017.
 */
public class EnumClass {
    public static void main(String[] args) {
        for (Shrubbery s :
                Shrubbery.values()) {
            print(s.name());
            print(s.getDeclaringClass());
            print(s.getClass());
            print(s.ordinal());
        }
        for (String s :
                "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            print(shrub);
        }
    }
}

enum Shrubbery {
    GROUND,
    CRAWLING,
    HANGING
}
