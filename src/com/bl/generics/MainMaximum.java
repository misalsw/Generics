package com.bl.generics;

import java.util.Scanner;

public class MainMaximum {
    public static void main(String[] args) {
        Maximum max = new Maximum();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
            int option = scan.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter First Number: ");
                    int first = scan.nextInt();

                    System.out.println("Enter Second Number: ");
                    int second = scan.nextInt();

                    System.out.println("Enter Third Number: ");
                    int third = scan.nextInt();

                    max.maxInt(first, second, third);
                    break;
                }
                case 2: {
                    System.out.println("Enter First Number: ");
                    float first = scan.nextFloat();

                    System.out.println("Enter Second Number: ");
                    float second = scan.nextFloat();

                    System.out.println("Enter Third Number: ");
                    float third = scan.nextFloat();

                    max.maxFloat(first, second, third);
                    break;
                }
                case 3: {
                    System.out.println("Enter First Value: ");
                    String first = scan.next();

                    System.out.println("Enter Second Value: ");
                    String second = scan.next();

                    System.out.println("Enter Third Value: ");
                    String third = scan.next();
                    max.maxString(first, second, third);
                    break;
                }
                default:
                    System.out.println("Enter Choice between 1 to 3");
            }
        }
    }
}
