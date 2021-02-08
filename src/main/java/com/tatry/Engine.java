package com.tatry;

import java.util.Scanner;


public class Engine {
    public static Destination getInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę miejsca do którego planujesz jechać: ");
        String nameOfDestination = scanner.nextLine();
        System.out.println("Miejsce do którego zmierzasz to: " + nameOfDestination);
        System.out.println("Podaj odległość w km do: " + nameOfDestination);
        String howFarDestinationIs = scanner.nextLine();
        System.out.println(nameOfDestination + " znajduje się: " + howFarDestinationIs + " km od Ciebie");
        System.out.println("Podaj czym chcesz dojechać: )Bike, Car, HitchHiking, Train)");
        String methodOfTransport = scanner.nextLine();
        System.out.println("Wybrałeś/aś " + methodOfTransport + " do " + nameOfDestination + " oddalonego o " + howFarDestinationIs);
        int distance = Integer.parseInt(howFarDestinationIs);
        System.out.println(distance);
        Destination destination = new Destination.Builder(nameOfDestination,distance, Level.PRO).build();
        return destination;
    }

}
