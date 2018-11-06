package com.company;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2){

        if (o1.age > o2.getRetirementAge()){
            return -1;
        }
        if (o1.age < o2.getRetirementAge()) {
            return 1;
        }
        return 0;
    }
    }

