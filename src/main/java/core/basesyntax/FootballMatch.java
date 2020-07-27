package core.basesyntax;

public class FootballMatch {

    public int matchResult(int result1, int result2, int bet1, int bet2) {

        int resultEqual = result1 == bet1 && result2 == bet2 ? 2 : 0;

        int resultPart = result1 == result2 && bet1 == bet2
                || result1 < result2 && bet1 < bet2
                || result1 > result2 && bet1 > bet2 ? 1 : 0;

        int result = resultEqual > resultPart ? resultEqual : resultPart;

        return result;
    }
}
