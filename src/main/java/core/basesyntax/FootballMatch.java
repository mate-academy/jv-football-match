package core.basesyntax;

public class FootballMatch {
    public int matchResult(final int result1, final int result2, final int bet1, final int bet2) {
        return ((result1 == bet1 && result2 == bet2) ? 2 : (result1 > bet1 && result2 > bet2) ? 1 : 0);
    }
}
