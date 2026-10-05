import java.util.Scanner;

public class IT22156624Lab6Q2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        System.out.println("Please enter 10 numbers:");
        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");
        i = 0;
        while (i < 10) {
            System.out.print(nums[i] + " ");
            i++;
        }
        System.out.println();
    }
}
