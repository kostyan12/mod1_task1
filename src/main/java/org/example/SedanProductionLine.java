package org.example;

public class SedanProductionLine implements ProductionLine{
    @Override
    public void work() {
        Car car = new Car("SEDAN");
    }
}
