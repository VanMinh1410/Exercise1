package javaapplication19;

public class Car {

    private String model;
    private int year;

    public Car(String model, int year){
        this.model = model;
        this.year= year;
    }
    public void displayDetails(){
        System.err.println("Car Model:"+model+",year"+year);
    }
}
