package com.markmunsayac;

public class SystemFactory {
    public static Sistema getSystem(String system) {
        if (system == null) {
            return null;
        }
        if (system.equalsIgnoreCase("INVENTORY")) {
            return new Inventory();
        }
        if (system.equalsIgnoreCase("BANK")) {
            return new Bank();
        }
        return null;
    }
}
