package com.company;

public class MainClass {
    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher();
        System.out.println(dishwasher);
        Dishwasher dishwasher1 = new Dishwasher(12, 34, "INDESIT", 8);
        System.out.println(dishwasher1);
        Dishwasher dishwasher2 = new Dishwasher(12, 22, "BOSH",
                3, "black", 34.5, 13000, 15, "China",
                23.6, 34.7);
        System.out.println(dishwasher2);
        Dishwasher.printStaticWarrantyDurationInDays();
        dishwasher.printWarrantyDurationInDays();
    }
}
