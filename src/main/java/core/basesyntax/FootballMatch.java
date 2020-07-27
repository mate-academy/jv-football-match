package core.basesyntax;

public class FootballMatch {

    /**
     * <p>С помощью тернарного оператора написать функцию, которая будет считать исход матча.
     * Метод будет принимать 4 параметра и возвращать целое число.
     * 4 параметра метода - результат матча и то, какую ставку сделал пользователь.
     * Пример: 0,2,1,1. Что значит: команды сыграли в счёт 0:2, а пользователь ставил 1:1.
     * Задача:
     * если пользователь угадал 100% результат - возвращать 2
     * если угадал, что выиграла какая-либо команда
     * (пр. сыграли 1:2, а ставил 0:3 или сыграли 2:2, а ставил 3:3 - то пользователь у выиграше)
     * то возвращать 1
     * если не угадал ничего - возвращать 0.</p>
     */
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        int matchOutcome;
        int betOutcome;

        /* if match is played in a draw - 2,
        if first team wins - 1,
        if second team wins - 0
        */
        matchOutcome = result1 == result2
                ? 2
                : (result1 > result2 ? 1 : 0);

        // Same as in matchOutcome
        betOutcome = bet1 == bet2
                ? 2
                : (bet1 > bet2 ? 1 : 0);

        /* If results and bets are equal - 2,
        if outcome of match and of bets is same - 1,
        else - 0
         */
        return (result1 == bet1) && (result2 == bet2)
                ? 2
                : (matchOutcome == betOutcome ? 1 : 0);
    }
}
