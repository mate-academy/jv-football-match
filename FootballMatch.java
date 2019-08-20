package core.basesyntax;

public class FootballMatch {
    public static int matchResult(int score1, int score2, int bet1, int bet2) {
        return (score1 == bet1) && (score2 == bet2) ? 2 : ((score1 > score2) && (bet1 > bet2))
                || ((score2 > score1) && (bet2 > bet1))
                || ((score2 == score1) && (bet2 == bet1)) ? 1 : 0;
    }
}
