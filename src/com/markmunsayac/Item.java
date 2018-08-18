package com.markmunsayac;

public class Item {

    private String itemName;

    Item (String itemName) {
        this.itemName = itemName;
    }

    public static class Builder {
        private String itemName;

        public Builder setItemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        public Item build() {
            return new Item(itemName);
        }
    }

    public String getItemName() {
        return this.itemName;
    }
}
