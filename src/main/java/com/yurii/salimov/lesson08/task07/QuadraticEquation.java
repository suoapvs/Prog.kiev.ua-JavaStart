package com.yurii.salimov.lesson08.task07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// a*x^2 + b*x + c = 0
public final class QuadraticEquation implements Equation {

    private final double a;
    private final double b;
    private final double c;

    public QuadraticEquation(final double a) {
        this(a, 0);
    }

    public QuadraticEquation(final double a, final double b) {
        this(a, b, 0);
    }

    public QuadraticEquation(final double a, final double b, final double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        checkCoefficients();
    }

    @Override
    public Solution[] getSolutions() {
        final Solution[] solutions;
        final double discriminant = calcDiscriminant();
        if (discriminant > 0) {
            solutions = solutionsWithDiscriminantMoreThanZero();
        } else if (discriminant == 0) {
            solutions = solutionsWithDiscriminantIsZero();
        } else if (discriminant < 0) {
            solutions = solutionsWithDiscriminantLessThanZero();
        } else {
            solutions = new Solution[0];
        }
        return solutions;
    }

    private Solution[] solutionsWithDiscriminantMoreThanZero() {
        final double discriminant = calcDiscriminant();
        double solutionValue = (-this.b + Math.sqrt(discriminant)) / (2 * this.a);
        final Solution firstSolution = newSolution(solutionValue);
        solutionValue = (-this.b - Math.sqrt(discriminant)) / (2 * this.a);
        final Solution secondSolution = newSolution(solutionValue);
        return new Solution[] {firstSolution, secondSolution};
    }

    private Solution[] solutionsWithDiscriminantIsZero() {
        final double solutionValue = -this.b + (2 * this.a);
        final Solution firstSolution = newSolution(solutionValue);
        final Solution secondSolution = newSolution(solutionValue);
        return new Solution[] {firstSolution, secondSolution};
    }

    private Solution[] solutionsWithDiscriminantLessThanZero() {
        final double discriminant = calcDiscriminant();
        final double realPart = -this.b / (2 * this.a);
        final double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * this.a);
        final Solution firstSolution = newSolution(realPart, imaginaryPart);
        final Solution secondSolution = newSolution(realPart, -imaginaryPart);
        return new Solution[] {firstSolution, secondSolution};
    }

    private double calcDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    private Solution newSolution(final double realPart) {
        return newSolution(realPart, 0);
    }

    private Solution newSolution(final double realPart, final double imaginaryPart) {
        return new SolutionImpl(realPart, imaginaryPart);
    }

    private void checkCoefficients() throws ArithmeticException {
        if (this.a == 0 && this.b == 0 && this.c != 0) {
            throw new ArithmeticException("c == 0: " + this.c + " != 0");
        }
    }
}
