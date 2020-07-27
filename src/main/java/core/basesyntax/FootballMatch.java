package core.basesyntax;

public class FootballMatch {
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        int ans = ((result1 < result2 && bet1 < bet2)
                || (result1 > result2 && bet1 > bet2)
                || ((double)result1 / (double)result2 == (double)bet1 / (double)bet2)) ? 1 : 0;
        ans = (result1 == bet1 && result2 == bet2) ? 2 : ans;
        return ans;
    }
}
