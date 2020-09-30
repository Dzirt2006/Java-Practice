package regular;

import java.util.Scanner;

public class ExceptionBlocks {
    /*
     * Create the method long power(int, int) here.
     */
    int power(int x, int y) throws IllegalArgumentException {
        if (x == 0 && y == 0) {
            throw new IllegalArgumentException("n and p should not be zero.");
        } else if (x < 0 || y < 0) {
            throw new IllegalArgumentException("n or p should not be negative.");
        }
        return (int) Math.pow(x, y);
    }
}

class Solution {
    public static final ExceptionBlocks my_calculator = new ExceptionBlocks();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}