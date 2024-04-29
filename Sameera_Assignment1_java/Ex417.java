 
    
import java.util.Scanner;

public class Ex417{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tripCount = 0;
        double totalMiles = 0;
        double totalGallons = 0;

        System.out.println("Mileage !");

        while (true) {
        System.out.println(" trip " + (tripCount + 1) + " (or -1 to exit): ");
        int miles = input.nextInt();

         if (miles == -1) {
                break;
            }

         System.out.println(" gallons  " + (tripCount + 1) + ": ");
         int gallons = input.nextInt();

         double mpg = (double) miles / gallons;
         totalMiles += miles;
         totalGallons += gallons;

         System.out.printf("Miles per gallon for trip %d: %.2f%n", tripCount + 1, mpg);
         System.out.printf("Combined miles per gallon up to trip %d: %.2f%n", tripCount + 1, totalMiles / totalGallons);

        tripCount++;
        }

        System.out.println("exiting .");
        input.close();
    }
}

