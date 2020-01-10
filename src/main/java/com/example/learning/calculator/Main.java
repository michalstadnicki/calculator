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
                case 3:
                    multiplicationOperation(scanner, calculator);
                    break;
                case 4:
                    divisionOperation(scanner, calculator);
                    break;
                case 5:
                    moduloOperation(scanner, calculator);
                    break;
                default:
                    exit = true;
            }
        }
        while (!exit);
    }

    private static void printInfo() {
        System.out.println("**********************************************************************");
        System.out.println("Chose operation: 1(+), 2(-), 3(*), 4(/), 5(%) other number to exit");
        System.out.print("Enter: ");

    }

    private static void additionOperation(Scanner scanner, Calculator calculator) {
        int[] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.addition(twoNumbersFromInput[0], twoNumbersFromInput[1]);
        printResult(twoNumbersFromInput[0], twoNumbersFromInput[1], "+", result);

    }

    private static void substractionOperation(Scanner scanner, Calculator calculator) {
        int[] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.substraction(twoNumbersFromInput[0], twoNumbersFromInput[1]);
        printResult(twoNumbersFromInput[0], twoNumbersFromInput[1], "-", result);

    }

    private static void multiplicationOperation(Scanner scanner, Calculator calculator) {
        int[] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.multiplication(twoNumbersFromInput[0], twoNumbersFromInput[1]);
        printResult(twoNumbersFromInput[0], twoNumbersFromInput[1], "*", result);

    }

    private static void divisionOperation(Scanner scanner, Calculator calculator) {
        int[] twoNumbersFromInput = getTwoNumbersFromInput(scanner);

        if (twoNumbersFromInput[1] == 0) {
            System.out.println("Pamiętaj cholero nie dziel przez zero!");
        } else {
            int result = calculator.division(twoNumbersFromInput[0], twoNumbersFromInput[1]);
            printResult(twoNumbersFromInput[0], twoNumbersFromInput[1], "/", result);
        }

    }

    private static void moduloOperation(Scanner scanner, Calculator calculator) {
        int[] twoNumbersFromInput = getTwoNumbersFromInput(scanner);
        int result = calculator.modulo(twoNumbersFromInput[0], twoNumbersFromInput[1]);
        printResult(twoNumbersFromInput[0], twoNumbersFromInput[1], "%", result);

    }

    private static void printResult(int firstNumber, int secondNumber, String operator, int result) {
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
    }

    private static int[] getTwoNumbersFromInput(Scanner scanner) {

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        return new int[]{firstNumber, secondNumber};

    }

}
