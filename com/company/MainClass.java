package com.company;

public class MainClass {
    public static void main(String[] args) {
        Dishwasher whirlpool = new Dishwasher();
        System.out.println(whirlpool);
        Dishwasher indesit = new Dishwasher(12, 34, "INDESIT", 8);
        System.out.println(indesit);
        Dishwasher bosh = new Dishwasher(12, 22, "BOSH",
                3, "black", 34.5, 13000, 15, "China",
                23.6, 34.7);
        System.out.println(bosh);
        Dishwasher.printStaticNumberOfObjects();
        whirlpool.printNumberOfObjects();
    }
}
