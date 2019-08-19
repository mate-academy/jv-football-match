package core.basesyntax;

public class FootballMatch {
    
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        int win = 0;
        win = (result1 > result2 && bet1 > bet2 || result1 < result2 && bet1 < bet2) ? 1 : win;
        win = (result1 + result2 == bet1 + bet2) ? 2 : win;
        return win;
    }
}
