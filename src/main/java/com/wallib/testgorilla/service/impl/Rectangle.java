package com.wallib.testgorilla.service.impl;

import com.wallib.testgorilla.service.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}