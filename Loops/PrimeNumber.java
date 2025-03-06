package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        System.out.println(count == 2 ? "Prime Number" : "Not a Prime Number");
        sc.close();
    }
}
