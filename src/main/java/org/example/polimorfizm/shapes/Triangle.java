package org.example.polimorfizm.shapes;

public class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    public static void ShowMessage(){
        System.out.println("Message from Shape");
    }
}

