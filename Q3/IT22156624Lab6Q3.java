import java.util.Scanner;

public class IT22156624Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sumOfSquares = 0;
        int count = 0;

        System.out.println("Enter positive integers (terminate input with -99):");
        while (true) {
            System.out.print("Enter a number: ");
            int x = sc.nextInt();

            if (x == -99) {
                break;
            }
            if (x < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }
            sumOfSquares += (long) x * x;
            count++;
        }

        System.out.println();
        if (count == 0) {
            System.out.println("No valid numbers were entered.");
        } else {
            double rms = Math.sqrt((double) sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }
    }
}
