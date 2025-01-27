package solutions;

import java.util.*;

// Made by Khraos on 27-01-2025
// System time is: 16:08 and the day is: Mon

/*
    Question III
        Write a program to input positive integer elements into an array of size 20 and perform
        the following operations:
            a) Display all Prime numbers and their sum
            b) Display all Odd numbers and their product
            c) Display the count of even numbers
 */

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        int primeSum = 0, oddProduct = 1, evenCount = 0;

        System.out.println("Enter 20 positive integers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Prime numbers:");
        for (int i = 0; i < 20; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
                primeSum += arr[i];
            }
        }
        System.out.println("\nSum of Prime numbers: " + primeSum);

        System.out.println("Odd numbers:");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                oddProduct *= arr[i];
            }
        }
        System.out.println("\nProduct of Odd numbers: " + oddProduct);

        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of Even numbers: " + evenCount);

        in.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
