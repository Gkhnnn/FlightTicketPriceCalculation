package FlightTicketPriceCalculation;

import java.util.Scanner;

public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age, distance, medicine;
        System.out.println("Please enter your age.");
        age = scan.nextInt();
        System.out.println("Please enter the distance");
        distance = scan.nextInt();
        System.out.println("Please select type (1: departure ,2:round trip) :");
        medicine = scan.nextInt();

        double normalPrice, ageDiscount, roundTrip;
        if (age > 0 && distance > 0 && (medicine == 1 || medicine == 2)) {
            normalPrice = distance * 0.50;
            if (age < 12) {
                ageDiscount = normalPrice * 0.7;

            } else if (age >= 12 && age <= 24) {
                ageDiscount = normalPrice * 0.30;

            } else if (age > 65) {
                ageDiscount = normalPrice * 0.40;

            } else {
                ageDiscount = 0;
            }
            normalPrice -= ageDiscount;
            if (medicine == 2) {
                roundTrip = normalPrice * 0.30;
                normalPrice = (normalPrice - roundTrip) * 2;

            }
            System.out.println("Ticket Amount :" + normalPrice + "$");
        } else {
            System.out.println("You entered incorrectly, please try again.");
        }
    }
}
