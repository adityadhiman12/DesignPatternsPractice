package org.example;

import org.example.FactoryPattern.Shape;
import org.example.FactoryPattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
        shapeObj.draw();
    }
}