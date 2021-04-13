package com.company;

public class Dishwasher {
    private static int warrantyDurationInDays = 12000;

    private int waterConsumption;
    private int programsNumber;
    private String name;
    private int numberUtensilsSets;

    private String colour;
    private double weight;
    private double price;
    private int powerConsumptionInWatts;
    private String producingCountry;

    protected double width;
    protected double length;

    public Dishwasher() {
        int warrantyDurationInDays = 0;

        int waterConsumption = 0;
        int programsNumber = 0;
        String name;
        int numberUtensilsSets = 0;

        String colour;
        double weight = 0;
        double price = 0;
        int powerConsumptionInWatts = 0;
        String producingCountry;

        double width = 0;
        double length = 0;
    }

    public Dishwasher(int waterConsumption, int programsNumber, String name, int numberUtensilsSets) {
        this();
        this.waterConsumption = waterConsumption;
        this.programsNumber = programsNumber;
        this.name = name;
        this.numberUtensilsSets = numberUtensilsSets;
    }

    public Dishwasher(int waterConsumption, int programsNumber, String name, int numberUtensilsSets, String colour,
                      double weight, double price, int powerConsumptionInWatts, String producingCountry,
                      double width, double length) {
        this(waterConsumption, programsNumber, name, numberUtensilsSets);
        this.colour = colour;
        this.weight = weight;
        this.price = price;
        this.powerConsumptionInWatts = powerConsumptionInWatts;
        this.producingCountry = producingCountry;
        this.width = width;
        this.length = length;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public void setWaterConsumption(int waterConsumption) {
        this.waterConsumption = waterConsumption;
    }

    public int getProgramsNumber() {
        return programsNumber;
    }

    public void setProgramsNumber(int programsNumber) {
        this.programsNumber = programsNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberUtensilsSets() {
        return  numberUtensilsSets;
    }

    public void setNumberUtensilsSets(int numberUtensilsSets) {
        this.numberUtensilsSets = numberUtensilsSets;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPowerConsumptionInWatts() {
        return powerConsumptionInWatts;
    }

    public void setPowerConsumptionInWatts(int powerConsumptionInWatts) {
        this.powerConsumptionInWatts = powerConsumptionInWatts;
    }

    public String getProducingCountry() {
        return producingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        this.producingCountry = producingCountry;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public static void printStaticWarrantyDurationInDays() {
        System.out.println(warrantyDurationInDays);
    }

    public void printWarrantyDurationInDays() {
        System.out.println(warrantyDurationInDays);
    }

    public String toString() {
        return waterConsumption+" "+programsNumber+" "+name+" "+numberUtensilsSets+" "+colour+" "+weight+" "+price+" "+
                powerConsumptionInWatts+" "+producingCountry+" "+width+" "+length;
    }

    public void resetValues(int waterConsumption, int programsNumber, String name, int numberUtensilsSets, String colour,
                            double weight, double price, int powerConsumptionInWatts, String producingCountry,
                            double width, double length) {
        this.waterConsumption = waterConsumption;
        this.programsNumber = programsNumber;
        this.name = name;
        this.numberUtensilsSets = numberUtensilsSets;
        this.colour = colour;
        this.weight = weight;
        this.price = price;
        this.powerConsumptionInWatts = powerConsumptionInWatts;
        this.producingCountry = producingCountry;
        this.width = width;
        this.length = length;

    }
}
