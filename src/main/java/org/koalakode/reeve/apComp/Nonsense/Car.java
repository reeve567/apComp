package org.koalakode.reeve.apComp.Nonsense;

public class Car {
    private String make;
    private String model;
    private int year;
    private double miles;
    private boolean antique;

    Car() {
        make = "";
        model = "";
        year = 0;
        antique = false;
    }

    Car(String make,String model) {
        this.make = make;
        this.model = model;
        this.year = 2018;
        antique = false;
    }

    Car(String make,String model,int year,double miles) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.miles = miles;
        antique = false;
    }


    public double getMiles() {
        return miles;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    public boolean getAntique() {
        return antique;
    }

    public void addMiles(int n) {
        miles += n;
    }
    public void checkAntique() {
        if (2018-year>=50) {
            antique = true;
        }
    }

    @Override
    public String toString() {
        return getMiles() + ", " + getYear() + ", " + getMake() + ", " + getModel() + ", " + getAntique();
    }
}
