package com.markmunsayac;

import java.lang.Override;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Inventory extends Sistema implements Items {
    private String name;
    private static final String ADDRESS = "40 Birch Hill St. \n" +
                                                "Saint Johns, FL 32259";
    private static Map<String, Integer> storageItems = new HashMap<>();

    Inventory() {
        storageItems.put("apple", 5);
        storageItems.put("banana", 2);
        storageItems.put("orange", 1);
    }

    @Override
    public void setSystemName(String name) {
        this.name = name;
    }

    @Override
    public String getSystemName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return ADDRESS;
    }

    @Implement
    public void add(String name, Integer amount) {
        storageItems.put(name, amount);
    }

    @Implement
    public void delete(String key) {
        storageItems.remove(key);
    }

    @Implement
    public void displayItems() {
        Set keys = storageItems.keySet();
        System.out.println("List of Storage Items:");
        for (Iterator i = keys.iterator(); i.hasNext();) {
            String key = (String) i.next();
            System.out.println(key + " = " + storageItems.get(key));
        }
    }


}
