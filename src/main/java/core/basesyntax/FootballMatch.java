package core.basesyntax;
public class FootballMatch {
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        int result = 0;
        result = (result1 == result2 && bet1 == bet2 || result1 > result2 && bet1 > bet2 || result1 < result2 && bet1 < bet2) ? 1 : result;
        result = (result1 == bet1 && result2 == bet2) ? 2 : result;
        return result;
    }
}
