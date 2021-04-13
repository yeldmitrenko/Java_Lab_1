package com.company;

public class Dishwasher {
    private static int numberOfObj = 0;

    private int waterConsumption = 0;
    private int programsNumber = 0;
    private String name;
    private int numberUtensilsSets = 0;

    private String colour;
    private double weight = 0;
    private double price = 0;
    private int powerConsumptionInWatts = 0;
    private String producingCountry;

    protected double width = 0;
    protected double length = 0;

    public Dishwasher() {
        numberOfObj += 1;
    }

    public Dishwasher(int waterConsumption, int programsNumber, String name, int numberUtensilsSets) {
        this.waterConsumption = waterConsumption;
        this.programsNumber = programsNumber;
        this.name = name;
        this.numberUtensilsSets = numberUtensilsSets;
        numberOfObj += 1;
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
        System.out.println("The number of dishwashers: " + numberOfObj);
    }

    public void printWarrantyDurationInDays() {
        System.out.println("The number of dishwashers: " + numberOfObj);
    }

    @Override
    public String toString() {
        return "Dishwasher:\n\tWater consumption: " + waterConsumption + "\n\t" + "Number of programs: "
                + programsNumber +"\n\t" + "Name: "+ name + "\n\t" + "Number of utensils sets: " + numberUtensilsSets
                + "\n\t" + "Colour: " + colour + "\n\t" + "Weight: " + weight + "\n\t" + "Price: " + price + "\n\t" +
                "Power consumption (in watts): " + powerConsumptionInWatts + "\n\t" + "Producing country: " +
                producingCountry + "\n\t" + "Width: " + width + "\n\t" + "Length: " + length;
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
