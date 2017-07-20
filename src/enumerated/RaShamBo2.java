package enumerated;

import static enumerated.Outcome.*;

/**
 * Created by xjshi on 04/06/2017.
 */
public enum RaShamBo2 implements Competitor<RaShamBo2>{
    PAPER(DRAW, LOSE, WIN),
    SCISSORS(WIN, DRAW, LOSE),
    ROCK(LOSE, WIN, DRAW);

    private Outcome vPAPER, vSCISSORS, vROCK;

    RaShamBo2(Outcome vPAPER, Outcome vSCISSORS, Outcome vROCK) {
        this.vPAPER = vPAPER;
        this.vSCISSORS = vSCISSORS;
        this.vROCK = vROCK;
    }

    @Override
    public Outcome compete(RaShamBo2 compitor) {
        switch (compitor) {
            default:
            case PAPER:
                return vPAPER;
            case SCISSORS:
                return vSCISSORS;
            case ROCK:
                return vROCK;
        }
    }

    public static void main(String[] args) {

    }
}
