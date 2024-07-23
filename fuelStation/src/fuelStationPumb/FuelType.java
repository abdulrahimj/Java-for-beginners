package fuelStationPumb;

import java.sql.SQLOutput;

public class FuelType {

    //constant for price per litre
    public static double PRICE_PER_LITRE = 28.5;

    //CHOOSE WHICH FUEL TYPE YOU NEED
    public void fuelOption(){
        System.out.println("\nWELCOME TO BIG VISSION FUEL STATION");
        System.out.println("------------------------------------");
        System.out.println("CHOOSE FUEL TYPE:");
        System.out.println("1. Petrol");
        System.out.println("2. Diesel");
        System.out.println("3. Kerosene");
        System.out.println("4. Exit");
        System.out.print("Choice: ");
        int choice = InputHelper.input.nextInt();
        handleChoice(choice);
    }

    public static void handleChoice(int choice){
        switch (choice){
            case 1:
                Petrol.measurement();
                break;
            case 2:
                Diesel.measurement();
                break;
            case 3:
                Kerosene.measurement();
                break;
            case 4:
                break;
            default:
                System.out.println("Invalid option selected");
        }
    }
}

