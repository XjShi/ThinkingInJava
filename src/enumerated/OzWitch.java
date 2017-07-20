package enumerated;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 16/03/2017.
 */
public enum  OzWitch {
    WEST("Miss Gulch, aks the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby Slippers, curshed by Dorothy's house"),
    SOUTH("Good by inference, but missing"),
    Center(1);

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    private OzWitch(int c) {
        this.description = new Integer(c).toString();
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch :
                OzWitch.values()) {
            print(witch + "----" + witch.getDescription());
        }
    }
}
