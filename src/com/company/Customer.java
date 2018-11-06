package com.company;

import java.util.Comparator;

public class Customer  {
    public final int FEMALE_RETIREMENT_AGE = 55;
    public final int MALE_RETIREMENT_AGE = 60;
    public String sex;
    public int age;
    public String name;
  //  public int retirementAge;
    Customer(int age, String name, String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getRetirementAge(){
        if (this.sex.equals("f")) {
          return FEMALE_RETIREMENT_AGE;
        }
        if (this.sex.equals("m")){
           return MALE_RETIREMENT_AGE;
        }

        throw new IllegalArgumentException("Unknown sex");
    }

}
