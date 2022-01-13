package com.softserveinc;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has: ");
        System.out.print(">>> ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        System.out.print(">>> ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        System.out.print(">>> ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        System.out.print(">>> ");
        int cups = scanner.nextInt();
        int waterPerCup = 200;
        int milkPerCup = 50;
        int beansPerCup = 15;
        int waterCups = water / waterPerCup;
        int milkCups = milk / milkPerCup;
        int beansCups = beans / beansPerCup;
        int minCups = Math.min(waterCups, milkCups);
        minCups = Math.min(minCups, beansCups);
        if (minCups == cups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (minCups < cups) {
            System.out.println("No, I can make only " + minCups + " cup(s) of coffee");
        } else if (minCups > cups) {
            int extraCups = minCups - cups;
            System.out.println("Yes, I can make that amount of coffee (and even "  + extraCups +  " more than that) ");
        }
    }
}
