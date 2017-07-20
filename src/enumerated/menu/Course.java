package enumerated.menu;

import net.mindview.util.Enums;

/**
 * Created by xjshi on 16/03/2017.
 */
public enum Course {
    APPETIZIER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    Course(Class<? extends Food> kind) {
        this.values = kind.getEnumConstants();
    }
    public Food randomSelection() {
        return Enums.random(values);
    }
}
