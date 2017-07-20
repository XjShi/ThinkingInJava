package enumerated.menu;

/**
 * Created by xjshi on 16/03/2017.
 */
public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS
    }
    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI, LENTLS, HUMMOUS, VINDALOD
    }
    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL
    }
    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE_ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA
    }
}
