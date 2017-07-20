package enumerated;

/**
 * Created by xjshi on 04/06/2017.
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T compitor);
}
