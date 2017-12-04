package com.yurii.salimov.lesson04.task08;

import java.util.Scanner;

public final class CalculatorImpl implements Calculator {

    private final Scanner scanner;

    public CalculatorImpl() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        final String line = read();
        final double[] numbers = parseNumbers(line);
        final String[] operators = parseOperators(line);
        final double result = calculate(numbers, operators);
        print(line, result);
    }

    private String read() {
        return this.scanner.nextLine();
    }

    private double calculate(final double[] numbers, final String[] operators) {
        double result = numbers[0];
        for (int i = 1; i < operators.length; i++) {
            switch (operators[i]) {
                case "+":
                    result += numbers[i];
                    break;
                case "-":
                    result -= numbers[i];
                    break;
                case "/":
                    result /= numbers[i];
                    break;
                case "*":
                    result *= numbers[i];
                    break;
            }
        }
        return result;
    }

    private double[] parseNumbers(final String line) {
        final String[] numb = line.split("[+-/*]");
        final double[] numbers = new double[numb.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.valueOf(numb[i]);
        }
        return numbers;
    }

    private String[] parseOperators(final String line) {
        return line.split("\\d+");
    }

    private void print(final String line, final double result) {
        System.out.println(line + " = " + result);
    }
}