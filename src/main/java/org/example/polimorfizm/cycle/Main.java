package org.example.polimorfizm.cycle;


import static org.example.polimorfizm.cycle.Cycle.ride;

public class Main {
    public static void main(String[] args) {
        Unicycle u = new Unicycle();
        Bicycle b = new Bicycle();
        Tricycle t = new Tricycle();

        ride(b, 2);

    }
}
