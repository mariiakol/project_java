package com.company;

public class Car {
        private int IDcar;
        private String mark;
        private String model;
        private int yearOfManufacture;
        private String color;
        private  double price;
        private int regNo;

    public Car(int IDcar, String mark, String model, int yearOfManufacture, String color, double price, int regNo) {
        this.IDcar = IDcar;
        this.mark = mark;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.price = price;
        this.regNo = regNo;
    }

    public int getIDcar() {
        return IDcar;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setIDcar(int IDcar) {
        this.IDcar = IDcar;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }


    @Override
    public String toString() {
        return "Car: " +
                "IDcar=" + IDcar +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNo=" + regNo +
                ';';
    }
}
