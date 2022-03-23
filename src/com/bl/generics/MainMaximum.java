package com.bl.generics;

import java.util.Scanner;

public class MainMaximum {
    public static void main(String[] args) {
        Maximum max = new Maximum();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Value: ");
        String first = scan.next();

        System.out.println("Enter Second Value: ");
        String second = scan.next();

        System.out.println("Enter Third Value: ");
        String third = scan.next();

        max.maxString(first, second, third);
    }
}
