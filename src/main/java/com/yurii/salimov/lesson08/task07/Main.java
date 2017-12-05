package com.yurii.salimov.lesson08.task07;

/**
 * 8.7 Задача
 *
 * Написать программу для решения квадратных уравнений.*
 * a*x^2 + b*x + c = 0
 *
 * @author Yuriy Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final double a = 1;
        final double b = 2;
        final double c = 3;
        final Equation equation = new QuadraticEquation(a, b, c);
        final Solution[] solutions = equation.getSolutions();
        for (Solution solution : solutions) {
            System.out.println(solution);
        }
    }
}
