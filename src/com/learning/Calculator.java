package com.learning;
public class Calculator {
    public static void main(String[] args) {
        MathTaskPerformer mathTaskPerformer = new MathTaskPerformer();
        mathTaskPerformer.add(1,5);
        mathTaskPerformer.sub(25,5);
        mathTaskPerformer.div(10,3);
        mathTaskPerformer.mult(100,10);
    }
}
