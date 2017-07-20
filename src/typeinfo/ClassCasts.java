package typeinfo;

/**
 * Created by xjshi on 04/06/2017.
 */
class Building {

}

class House extends Building {

}

public class ClassCasts {
    public static void main(String[] args) {
        Building b = new House();
        Class<House> houseType = House.class;
        House h = houseType.cast(b);
    }
}

