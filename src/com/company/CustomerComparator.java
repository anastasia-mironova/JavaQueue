package com.company;

import java.util.Comparator;
/*
 * Comparator для класса Customer
 *
 * @version 1.1 01 Nov 2018
 * @author Anastasia Mironova
 */
public class CustomerComparator implements Comparator<Customer> {

    @Override /* Переопределение compare */
    public int compare(final Customer o1, final Customer o2) {

        if (o1.age > o2.getRetirementAge()) {
            return -1;
        }
        if (o1.age < o2.getRetirementAge()) {
            return 1;
        }
        return 0;
    }
    }

