package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class FootballMatchTest {

    @Test
    public void matchScore() {
        FootballMatch footballMatch = new FootballMatch();
        for (int result1 = 1; result1 < 5; result1++) {
            for (int result2 = 1; result2 < 5; result2++) {
                for (int bet1 = 1; bet1 < 5; bet1++) {
                    for (int bet2 = 1; bet2 < 5; bet2++) {
                        int actualResult =
                                footballMatch.matchResult(result1, result2, bet1, bet2);
                        int expectedResult
                                = footballMatchResult(result1, result2, bet1, bet2);

                        Assert.assertEquals("Test failed with parameters = "
                                + result1 + ", " + result2 + ", "
                                + bet1 + ", " + bet2, expectedResult, actualResult);
                    }
                }
            }
        }
    }

    private int footballMatchResult(int result1, int result2, int bet1, int bet2) {
        return (result1 == bet1 && result2 == bet2) ? 
                    2 : 
                    ((result1 > result2 && bet1 > bet2) || (result1 < result2 && bet1 < bet2) || (result1 == result2 && bet1 == bet2) 
                    ? 1 : 0;
    }
}
