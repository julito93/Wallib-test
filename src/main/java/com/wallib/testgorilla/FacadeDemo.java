package com.wallib.testgorilla;

/**
 * Hello world!
 */
public final class FacadeDemo {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        ShapeMaker shapeMaker = new ShapeMaker(); 
        
        // Call each draw method using the facade
         shapeMaker.drawCircle();
         shapeMaker.drawSquare();
         shapeMaker.drawRectangle();
    }
}
