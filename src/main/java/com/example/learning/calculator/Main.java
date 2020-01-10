package com.example.learning.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("CALCULATOR");

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new CalculatorImpl();

        boolean exit = false;

        do {
            printInfo();
            byte operationNumber = scanner.nextByte();
            switch (operationNumber) {
                case 1:
                    additionOperation(scanner, calculator);
                    break;
                case 2:
                    substractionOperation(scanner, calculator);
                    break;
                default:
                    exit = true;
            }
        }
        while (!exit);
    }

    private static void printInfo() {
        System.out.println("*************************************************");
        System.out.println("Chose operation: 1(+), 2(-), other number to exit");
        System.out.print("Enter: ");

    }

    private static void additionOperation(Scanner scanner, Calculator calculator) {
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = calculator.addition(firstNumber, secondNumber);
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);

    }

    private static void substractionOperation(Scanner scanner, Calculator calculator) {
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        int result = calculator.substraction(firstNumber, secondNumber);
        System.out.println(firstNumber + " - " + secondNumber + " = " + result);

    }

}
