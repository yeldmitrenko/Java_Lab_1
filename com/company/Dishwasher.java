package com.company;

public class Dishwasher {
    private static int numberOfObj;

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
        numberOfObj++;
    }

    public Dishwasher(int waterConsumption, int programsNumber, String name, int numberUtensilsSets, String colour,
                      double weight, double price, int powerConsumptionInWatts, String producingCountry,
                      double width, double length) {
        setValues(waterConsumption, programsNumber, name, numberUtensilsSets, colour,
                weight, price, powerConsumptionInWatts, producingCountry,
                width, length);
        numberOfObj++;
    }

    public Dishwasher(int waterConsumption, int programsNumber, String name, int numberUtensilsSets) {
        this(waterConsumption, programsNumber, name, numberUtensilsSets, null, 0, 0,
                0, null, 0, 0);
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

    @Override
    public String toString() {
        return "Dishwasher{" +
                "waterConsumption=" + waterConsumption +
                ", programsNumber=" + programsNumber +
                ", name='" + name + '\'' +
                ", numberUtensilsSets=" + numberUtensilsSets +
                ", colour='" + colour + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", powerConsumptionInWatts=" + powerConsumptionInWatts +
                ", producingCountry='" + producingCountry + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public static void printStaticNumberOfObjects() {
        System.out.println("The number of dishwashers: " + numberOfObj);
    }

    public void printNumberOfObjects() {
        System.out.println("The number of dishwashers: " + numberOfObj);
    }

    public void resetValues(int waterConsumption, int programsNumber, String name, int numberUtensilsSets, String colour,
                            double weight, double price, int powerConsumptionInWatts, String producingCountry,
                            double width, double length) {
        setValues(waterConsumption, programsNumber, name, numberUtensilsSets, colour,
        weight, price, powerConsumptionInWatts, producingCountry,
        width, length);
    }

    public void setValues(int waterConsumption, int programsNumber, String name, int numberUtensilsSets, String colour,
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
