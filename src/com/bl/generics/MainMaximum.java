package com.bl.generics;

import java.util.Scanner;

public class MainMaximum {
    public static void main(String[] args) {
        Maximum max = new Maximum();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        float first = scan.nextFloat();

        System.out.println("Enter Second Number: ");
        float second = scan.nextFloat();

        System.out.println("Enter Third Number: ");
        float third = scan.nextFloat();

        max.maxFloat(first, second, third);
    }
}
