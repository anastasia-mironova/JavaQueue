package com.company;

/*
 * Comparator для класса Customer
 *
 * @version 1.1 01 Nov 2018
 * @author Anastasia Mironova
 */

public class Customer  {
    private final int FEMALE_RETIREMENT_AGE = 55;
    private final int MALE_RETIREMENT_AGE = 60;
    private String sex;
    public int age;
    public String name;

    Customer(int _age, String _name, String _sex) {
        this.age = _age;
        this.name = _name;
        this.sex = _sex;
    }

    public int getRetirementAge() {
        if (this.sex.equals("f")) {
          return this.FEMALE_RETIREMENT_AGE;
        }
        if (this.sex.equals("m"))  {
           return this.MALE_RETIREMENT_AGE;
        }

        throw new IllegalArgumentException("Unknown sex");
    }

}
