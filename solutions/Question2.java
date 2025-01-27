package solutions;

import java.util.*;

// Made by Khraos on 27-01-2025
// System time is: 15:54 and the day is: Mon

/*
    Question II
        Write a program to store the names of any 10 Items in a String type array along with their
        Price in an integer array. Sort the elements in Ascending Order of their Price using Bubble
        Sort Technique and display the Item names along with their price after sorting.
        Sample Input/Output:
        Input
        Array 1 = Pen Scale Notebook Eraser (Items)
        Array 2 = 30 15 80 10 (Price)
        Output:
        Array 1 = Eraser Scale Pen Notebook
        Array 2 = 10 15 30 80
 */

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] names = new String[10];
        int[] price = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name: ");
            names[i] = in.nextLine();
            System.out.print("Enter cost of "+names[i]+": ");
            price[i] = in.nextInt();
            in.nextLine();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (price[j] > price[j + 1]) {
                    int temp = price[j];
                    price[j] = price[j+1];
                    price[j+1] = temp;

                    String tempN = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempN;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Price of "+names[i]+": ");
            System.out.println(price[i]);
        }

        in.close();
    }
}

/*
    Above code using selection sort:
        public class Question2 {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String[] names = new String[10];
                int[] price = new int[10];
                for (int i = 0; i < 10; i++) {
                    System.out.print("Enter name: ");
                    names[i] = in.nextLine();
                    System.out.print("Enter cost of "+names[i]+": ");
                    price[i] = in.nextInt();
                    in.nextLine();
                }

                for (int i = 0; i < 10; i++) {
                    int nI = i;
                    for (int j = i + 1; j < 10; j++) {
                        if (price[j] < price[nI]) {
                            nI = j;
                        }
                    }
                    int temp = price[i];
                    price[i] = price[nI];
                    price[nI] = temp;

                    String tempN = names[i];
                    names[i] = names[nI];
                    names[nI] = tempN;
                }

                for (int i = 0; i < 10; i++) {
                    System.out.print("Price of "+names[i]+": ");
                    System.out.println(price[i]);
                }

                in.close();
            }
        }
 */