package com.company;

import java.util.PriorityQueue;
import java.util.Queue;
/*
 * Основной класс
 *
 * @version 1.1 01 Nov 2018
 * @author Anastasia Mironova
 */

public class Main {

    public static void main(final String[] args) {
        CustomerComparator comparator = new CustomerComparator();
        Queue<Customer> pq = new PriorityQueue(4, comparator);

        pq.add(new Customer(12, "Vasya", "m"));
        pq.add(new Customer(45, "Tanya", "f"));
        pq.add(new Customer(64, "Vladimir", "m"));
        pq.add(new Customer(56, "Elena", "f"));


    }
}
