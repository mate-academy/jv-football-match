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
     * (пр. сыграли 1:2, а ставил 0:3 - то пользователь у выиграше)
     * то возвращать 1
     * если не угадал ничего - возвращать 0.</p>
     */
    public int matchResult(int result1, int result2, int bet1, int bet2) {
        boolean firstTeamWin = false;
        boolean userBetOnFirstTeam = false;
        boolean draw = false;
        boolean userBetOnDraw = false;
        if (bet1 == bet2) userBetOnDraw = true;
        if (result1 == result2) draw = true;
        if (result1 > result2) firstTeamWin = true;
        if (bet1 > bet2) userBetOnFirstTeam = true;
        if (result1 == bet1 && result2 == bet2) {
            return 2;
        } else if (firstTeamWin == userBetOnFirstTeam && userBetOnDraw == draw) {
            return 1;
        } else {
            return 0;
        }
    }
}
