package com.bl.generics;

import java.util.Scanner;

public class MainMaximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Maximum max;

        while (true) {
            System.out.println("\nSelect Your Choice:\n1.Integer\n2.Float\n3.String");
            int option = scan.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter First Number: ");
                    Integer first = scan.nextInt();

                    System.out.println("Enter Second Number: ");
                    Integer second = scan.nextInt();

                    System.out.println("Enter Third Number: ");
                    Integer third = scan.nextInt();

                    max = new Maximum<Integer>(first, second, third);
                    max.findMax();
                    break;
                }
                case 2: {
                    System.out.println("Enter First Number: ");
                    Float first = scan.nextFloat();

                    System.out.println("Enter Second Number: ");
                    Float second = scan.nextFloat();

                    System.out.println("Enter Third Number: ");
                    Float third = scan.nextFloat();

                    max = new Maximum<Float>(first, second, third);
                    max.findMax();
                    break;
                }
                case 3: {
                    System.out.println("Enter First Value: ");
                    String first = scan.next();

                    System.out.println("Enter Second Value: ");
                    String second = scan.next();

                    System.out.println("Enter Third Value: ");
                    String third = scan.next();

                    max = new Maximum<String>(first, second, third);
                    max.findMax();
                    break;
                }
                default:
                    System.out.println("Enter Choice between 1 to 3");
            }
        }
    }
}
