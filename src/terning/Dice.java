package terning;

import java.util.Random;

public class Dice {

    // Roll the dice and return a value from 1 to 6
    public int roll() {
        Random random = new Random();

        // Rolls random number between 0(inclusive) and 6(exclusive)
        int Result = random.nextInt(6);
        return Result+1;
    }

    // Roll the dice n times and print the values
    public void rollMultiple(int n) {
        for (int i=1; i<=n; i++) {
            System.out.print(roll() + " ");
        }
    }
}
