package core.basesyntax;

public class FootballMatch {
    public int matchResult(int result1, int result2, int bet1, int bet2) {

        boolean boolVar = result1 - bet1 + result2 - bet2 == 0;
        return boolVar ? 2 : (result1 - result2) * (bet1 - bet2) > 0 ? 1 : 0;
    }


}
