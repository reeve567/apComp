package org.koalakode.reeve.apComp.Nonsense;

public class Cars {

    public static void main(String[] args) {
        Car carOne = new Car("Chevy","Camero",1965,54000);
        Car carTwo = new Car("Ford","Mustang");
        Car carThree = new Car();
        carTwo.addMiles(3500);
        carOne.checkAntique();
        println(carOne);
        println(carTwo);
    }

}
