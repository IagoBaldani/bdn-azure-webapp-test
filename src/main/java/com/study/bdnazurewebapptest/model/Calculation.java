package com.study.bdnazurewebapptest.model;

public class Calculation {
    private Operation operation;
    private int firstValue;
    private int secondValue;

    public Operation getOperation() {
        return operation;
    }
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int getFirstValue() {
        return firstValue;
    }
    public void setFirstValue(int firstValue) {
        this.firstValue = firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }
    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }
}
