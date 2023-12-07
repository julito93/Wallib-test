package com.wallib.testgorilla.service.impl;

import com.wallib.testgorilla.service.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}
