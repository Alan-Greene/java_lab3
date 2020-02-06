package Lab3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num_euro = 0;
        int num_fifty = 0;
        int num_twenty = 0;
        int num_ten = 0;
        int num_five = 0;
        int num_one = 0;

        System.out.println("Please enter the purchase price in cents: ");
        int purchase_price_cents = in.nextInt();
        System.out.println("Please enter the amount tendered in cents: ");
        int amount_tendered_cents = in.nextInt();
        int change_cents = amount_tendered_cents - purchase_price_cents;
        double change_euro = (double) change_cents / 100;
        double purchase_price_euro = (double) purchase_price_cents / 100;
        double amount_tendered_euro = (double) amount_tendered_cents / 100;

        if (change_cents < 0) {
            System.out.println("There is no change to be received.");
        } else {
            if (change_cents / 100 > 0) {
                num_euro = num_euro + (change_cents / 100);
                change_cents = change_cents % 100;
            }
            if (change_cents / 50 > 0) {
                num_fifty = num_fifty + (change_cents / 50);
                change_cents = change_cents % 50;
            }
            if (change_cents / 20 > 0) {
                num_twenty = num_twenty + (change_cents / 20);
                change_cents = change_cents % 20;
            }
            if (change_cents / 10 > 0) {
                num_ten = num_ten + (change_cents / 10);
                change_cents = change_cents % 10;
            }
            if (change_cents / 5 > 0) {
                num_five = num_five + (change_cents / 5);
                change_cents = change_cents % 5;
            }
            if (change_cents > 0){
                num_one = num_one + change_cents;
            }
        }

        System.out.printf("Purchase price: €%.2f%nAmount tendered: €%.2f%n%nYour change: €%.2f%n", purchase_price_euro, amount_tendered_euro, change_euro);
        System.out.printf("Euro:\t%5d%nFifty:\t%5d%nTwenty:\t%5d%nTen:\t%5d%nFive:\t%5d%nOne:\t%5d%n", num_euro, num_fifty, num_twenty, num_ten, num_five, num_one);
    }
}
