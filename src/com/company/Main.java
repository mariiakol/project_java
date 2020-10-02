package com.company;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(123, "BMW", "X5", 2020, "black", 15000.78, 2345 );
        Car car2 = new Car(124, "Mercedes", "E124", 1995, "green", 10000.9, 4659 );
        Car car3 = new Car(125, "Fiat", "Doblo", 2020, "red", 11000.78, 5739 );
        Car car4 = new Car(126, "BMW", "X6", 2019, "grey", 17000.78, 8914 );
        Car car5 = new Car(127, "BMW", "X3", 2008, "black", 15000.78, 5429 );
        Car car6 = new Car(128, "Mercedes", "CL63", 2017, "black", 12500.0, 75982 );
        Car car7 = new Car(129, "Mazda", "Vision Coupe", 2017, "pink", 16500.0, 39874 );

        System.out.println("----------------");
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);
        list.add(car7);

        Queries result = new Queries();
        List<Car> resultList1 = result.getCarsByMark(list);
    }
}
