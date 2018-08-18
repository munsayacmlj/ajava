package com.markmunsayac;

public class Bank extends Sistema {
    private String name;
    private static final String ADDRESS = "7931 West Dogwood Ave. \n" +
                                                "Durham, NC 27703";

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
}
