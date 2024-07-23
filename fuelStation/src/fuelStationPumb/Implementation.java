package fuelStationPumb;

//Petrol, Diesel and Kerosene use this implementation
public class Implementation {

    public static void measurement(){
        System.out.println("\n------------------------\n");
        System.out.println("PRICE PER LTR: Le28.5");
        System.out.print("No. of litres: ");
        int noLtr = InputHelper.input.nextInt();
        calculation(noLtr);
    }
    //calculation for the price depending on no. of litres
    public static void calculation(int noLtr) {
        double price = FuelType.PRICE_PER_LITRE * noLtr;

        int num = 0;

        while (num < noLtr) {  // Adjust the upper limit as per your requirement
            for (int count1 = 0; count1 <= 2500; count1++) {
                // Simulate counting process and freeze text
                System.out.print("COUNT: " + count1 + " NUM: " + num + "\r");
                try {
                    Thread.sleep(1); // Add a delay of 10 milliseconds (adjust as needed)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            num++;
        }

        // Display result after pump
        System.out.println(noLtr + " litres completed");
        System.out.println("Total Price Le: " + price);
    }
}
