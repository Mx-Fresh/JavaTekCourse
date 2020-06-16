package homework.june13;

//5) A foolproof winning strategy for roulette is to always bet on the same color: If you loose your wager, then you simply double the bet to compensate the loss.
//  The probability for red (or black) is 50% (we ignore the existence of zero).
//  Implement a Java method, that calculates how much money you approximately need for playing 1 000 000 times with 1 Euro as the first bet.
//  How much money do you approximately need, without loosing it during gambling?

public class Task5 {

    public static void main(String[] args) {

        int lostMoney = 0;
        int bet = 1;
        int gainedMoney = 0;
        int looses = 0;
        int wins = 0;
        double  currentColor;

        for (int i = 0; i < 1000000; i++) {
            currentColor = Math.random();
            // [0.0, 0.5] Red
            // [0.5, 1.0] Black
            // Wager is always on RED and the assumption is that in case a wager won when you take double bet.
            if(currentColor < 0.5) {
                System.out.println("RED");
                gainedMoney += bet * 2;
                bet = 1;
                wins++;
            } else {
                System.out.println("BLACK");
                lostMoney = lostMoney + bet;
                bet = bet * 2;
                looses++;
            }
        }

        System.out.println(lostMoney + " money lost in " + looses);
        System.out.println(gainedMoney + " money won in " + wins);
    }

}
