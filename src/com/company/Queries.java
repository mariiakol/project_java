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

    public static List<Car> getCarsByYear(List<Car> cars){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the model");
        String model = scanner.nextLine();
        System.out.println("Enter number of car's years you want to get");
        Integer n = scanner.nextInt();
        List<Car> carList = new ArrayList<>();
        for (Car c : cars){
            if(2020 - c.getYearOfManufacture() > n && c.getModel().toLowerCase().equals(model.toLowerCase())) {
                carList.add(c);
            }
        }
        if (carList.isEmpty()) System.out.println("not found");
        printList(carList);
        return carList;
    }

    public static List<Car> getCarsByPrice(List<Car> cars){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of manufacture");
        Integer year = scanner.nextInt();
        System.out.println("Enter the price of car");
        Float t = scanner.nextFloat();
        List<Car> carList = new ArrayList<>();
        for (Car c : cars){
            if(year == c.getYearOfManufacture() && t < c.getPrice()) {
                carList.add(c);
            }
        }
        if (carList.isEmpty()) System.out.println("not found");
        printList(carList);
        return carList;
    }
}