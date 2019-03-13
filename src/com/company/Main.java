// Justin Lazarski
// CIS3090.04
// 3/12/19

package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("About to encounter a method.");
        currentYear();
        System.out.println("Please enter a pizza diameter.");
        printPizzaArea(input.nextInt());
        for (int i = 0; i <5; i++) {
            displayMessage();
        }
    }
    public static void currentYear() {
        System.out.println("currentYear has been called.");
        int x = 2019;
        System.out.println("The current Year is " + x);
    }
        public static void printPizzaArea(double pizzaDiameter) {
            double pizzaRadius;
            double pizzaArea;
            double piVal = 3.14159265;

            pizzaRadius = pizzaDiameter / 2.0;
            pizzaArea = piVal * pizzaRadius * pizzaRadius;
            System.out.print(pizzaDiameter + " inch pizza is ");
            System.out.println(pizzaArea + " inches squared.");
        }
        public static void displayMessage() {
        System.out.println("The displayMessage method.");
        }
    }
