package com.weather.java.training;

import java.util.HashMap;
import java.util.Map;

public class UsingMap {
    public static void main(String[] args){
        Customer c1 = new Customer();
        c1.setEmail("patrick.day@weather.com");
        c1.setFirstName("Patrick");
        c1.setLastName("Day");

        Customer c2 = new Customer();
        c2.setEmail("Niki.Desur@weather.com");
        c2.setFirstName("Niki");
        c2.setLastName("Desur");

        Map<String, Customer> customerMap = new HashMap<>();
        customerMap.put("patrick.day@weather.com", c1);
        customerMap.put("niki.desur@weather.com", c2);
//        Customer error = customerMap.get("Mo");
//        System.out.println(error.toString());

        for(String key : customerMap.keySet()){

            Customer customer = customerMap.get(key);
            System.out.println(customer.toString());


        }


    }
}
