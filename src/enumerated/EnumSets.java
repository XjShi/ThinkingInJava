package enumerated;

import java.util.EnumSet;

import static net.mindview.util.Print.print;

/**
 * Created by xjshi on 04/06/2017.
 */
public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(AlarmPoints.BATHROOM);
        print(points);

        points.addAll(EnumSet.of(AlarmPoints.STAIR1, AlarmPoints.STAIR2, AlarmPoints.KITCHEN));
        print(points);

        points = EnumSet.allOf(AlarmPoints.class);
        print(points);

        points.removeAll(EnumSet.range(AlarmPoints.OFFICE1, AlarmPoints.OFFICE3));
        print(points);

        points = EnumSet.complementOf(points);
        print(points);
    }
}
