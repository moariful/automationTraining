package com.weather.java.training;

import java.util.*;


public class UsingArrayList {
    public static void main(String[] args){
        List<Customer> arrayList = new LinkedList<>();

        Customer c1 = new Customer();
        c1.setFirstName("Ifty");
        c1.setLastName("Smith");
        c1.setEmail("ifty.smith@somewhere.com");

        Customer c2 = new Customer();
        c2.setFirstName("Durga");
        c2.setLastName("Smith");
        c2.setEmail("durga.smith@somewhere.com");

        arrayList.add(c1);
        arrayList.add(c2);
        System.out.println("List size = " + arrayList.size());
    }
}
