package Loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), rev = 0, temp = num, digit;

        while (temp > 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        System.out.println(num == rev ? "Palindrome Number" : "Not a Palindrome Number");
        sc.close();
    }
}
