package com.yurii.salimov.lesson06.task01;

import java.util.Date;

public final class DifferentDateImpl implements DifferentDate {

    private final Date firstDate;

    private final Date secondDate;

    public DifferentDateImpl(final Date firstDate, final Date secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }

    @Override
    public void printDifferent() {
        if (this.firstDate.equals(this.secondDate)) {
            System.out.println("Dates are equivalent");
        } else {
            if ((this.firstDate.getDate() != (this.secondDate.getDate())) ||
                    (this.secondDate.getMonth() != (this.firstDate.getMonth())) ||
                    (this.secondDate.getYear() != (this.firstDate.getYear()))) {
                System.out.print("The difference between your and system date is ");
                System.out.print((this.secondDate.getYear() - this.firstDate.getYear()) + " year ");
                System.out.print((this.secondDate.getMonth() - this.firstDate.getMonth()) + " month and ");
                System.out.println((this.secondDate.getDate() - this.firstDate.getDate()) + " days.");
            }
        }
    }
}
