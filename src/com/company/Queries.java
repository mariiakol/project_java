package com.company;

import java.util.*;

public class Queries {

    private static void printList(List<Car> cars){
        for(Car car: cars){
            System.out.println(car);
        }
    }

    public static List<Car> getCarsByMark(List<Car> cars){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mark of the car you want to get");
        String mark = scanner.nextLine();
        List<Car> carList = new ArrayList<>();
        for (Car c : cars){
            if(c.getMark().toLowerCase().equals(mark.toLowerCase())) {
                carList.add(c);
            }
        }
        if (carList.isEmpty()) System.out.println("not found");
        printList(carList);
        return carList;
    }
}
