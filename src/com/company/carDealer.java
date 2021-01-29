package com.company;
import java.util.*;

public class carDealer {
    public static void main(String[] args) {
        HashMap<String, String> vehicles = puts();
        find(vehicles);

    }
    public static HashMap puts(){
        HashMap<String, String> vehicles = new HashMap<>();
        vehicles.put("Accord", "Honda");
        vehicles.put("Tacoma", "Toyota");
        vehicles.put("Focus", "Ford");
        vehicles.put("Navigator", "Lincoln");
        return vehicles;
    }

    public static void find(HashMap vehicles){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a make and it will return the model\n");
        String item = scanner.next();
        System.out.println(vehicles.get(item));
    }
}
