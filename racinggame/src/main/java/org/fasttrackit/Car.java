package org.fasttrackit;
// relatia de mostenire / inharitance or is a  relantionship
public class Car extends AutoVehicle {


    // instance variables
    int doorCount;


    public Car(Engine engine)
    {
        super(engine);
    }

    // constructor overloading
    public Car() {
        this (new Engine());
    }
}
