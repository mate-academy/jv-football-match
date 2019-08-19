package core.basesyntax;

public class FootballMatch {
    /**
     * This program is
     * my first homework.
     */
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        return result1 == result2 ? bet1 == bet2 ? bet1 == result1 ? 2 : 1 : 0
            : result1 > result2 ? bet1 > bet2 ? bet1 == result1 ? bet2 == result2 ? 2 : 1 : 1 : 0
            : bet2 > bet1 ? bet2 == result2 ? bet1 == result1 ? 2 : 1 : 1 : 0;
    }
}
