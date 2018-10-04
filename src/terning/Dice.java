package terning;

import java.util.Random;

public class Dice {
    // roll the die and return the value (1-6)
    public int roll() {
        Random random = new Random();
        // Rolls random number between 0(inclusive) and 6(exclusive)
        int Result = random.nextInt(6);
        return Result+1;
    }
    // roll the die n times and print the values
    public void rollMultiple(int n) {
        for (int i=1; i<=n; i++) {
            System.out.print(roll() + " ");
        }
    }
}
