package reusing;

/**
 * Created by xjshi on 03/03/2017.
 */
public class PlaceSetting {
}

class Plate {
    public Plate(int i) {
        System.out.println("Plate constructer");
    }
}

class DinnerPlate extends Plate {
    public DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructer");
    }
}

class Utensil {
    public Utensil(int i) {

    }
}
