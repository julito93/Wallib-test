package com.wallib.testgorilla;

import com.wallib.testgorilla.service.Shape;
import com.wallib.testgorilla.service.impl.*;

public class ShapeMaker {
    
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
