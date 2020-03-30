package core.basesyntax;

public class FootballMatch {

    public static int matchResult(int result1, int result2, int bet1, int bet2) {
      int betr = bet1 > bet2
                ? 1
                : bet1 < bet2
                ? 2 : 0;
        int winr = result1 > result2
                ? 1
                : result1 < result2
                ? 2 : 0;
        return (result1 == bet1 && result2 == bet2)
                ? 2
                : result1 < result2 && bet1 < bet2
                || result1 > result2 && bet1 > bet2
                || result1 == result2 && bet1 == bet2
                ? 1
                : 0;
    }

