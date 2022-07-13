package core.basesyntax;

public class FootballMatch {

    public int matchResult(int result1, int result2, int bet1, int bet2) {

        if (result1 == bet1 && result2 == bet2) {
            return 2;
        }

        if (bet1 > bet2 && result1 > result2) {
            return 1;
        }

        if (bet1 == bet2 && result1 == result2) {
            return 1;
        }

        return 0;
    }
}
