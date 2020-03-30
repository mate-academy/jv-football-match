package core.basesyntax;

public class FootballMatch {
     public static void main(String[] args) {
        System.out.println(matchResult(1,2,1,1));
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {
        int winr;
        int betr;
        betr = bet1 > bet2
                ? 1
                : bet1 < bet2
                ? 2 : 0;
        winr = result1 > result2
                ? 1
                : result1 < result2
                ? 2 : 0;
        return (result1 == bet1 && result2 == bet2)
                ? 2
                : (betr == winr)
                ? 1
                : 0;
    }

