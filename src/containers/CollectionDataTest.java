package containers;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by xjshi on 15/03/2017.
 */
class Government implements Generator<String> {
    String[] foundation = "strange women lying in ponds distributing swords is no basis for s sytem of government".split(" ");
    private int index;

    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}
