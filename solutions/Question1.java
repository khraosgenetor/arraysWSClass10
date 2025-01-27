package solutions;

import java.util.*;

// Made by Khraos on 27-01-2025
// System time is: 15:47 and the day is: Mon

/*
    Question I:
        Write a program that takes a character as an input and checks, if the character is a vowel or
        a consonant. Allow the user to enter repeatedly until the user enters a digit. Finally print
        the no. of vowels and the no. of consonants.
 */


public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vowels = 0, consonants = 0;

        System.out.println("Enter a character: ");

        while (true) {
            char ch = in.next().charAt(0);
            if(Character.isDigit(ch)) {
                System.out.println("Digit Detected. ");
                System.out.println("Vowel Count: "+vowels);
                System.out.println("Consonant Count: "+consonants);
                break;
            }

            if("AEIOUaeiou".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }

        in.close();
    }
}
