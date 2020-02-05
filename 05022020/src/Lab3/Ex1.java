package Lab3;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        // declaring constants
        final double TAX_BRACKET = 50000;
        final double TAX_ALLOWANCE_LOWER = 25000;
        final double TAX_ALLOWANCE_UPPER = 20000;
        final double TAX_SINGLE = 0.20;
        final double TAX_MARRIED = 0.23;
        double taxable_income = 0.0;
        double tax_paid = 0.0;
        double net_income = 0.0;
        String password = "";
        String password_check = "";
        String eol = "";

        // new scanner object
        Scanner in = new Scanner(System.in);

        // prompting for user input
        System.out.println("Welcome to tax calculator\n" +
                "Please enter your details below.\n" +
                "Employee ID: ");
        String emp_id = in.nextLine();
        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("Address: ");
        String address = in.nextLine();
        System.out.println("Marital status (s/m): ");
        String marital_status = in.nextLine();
        char ms = marital_status.charAt(0);
        System.out.println("Gross pay: ");
        double gross_pay = in.nextDouble();

        // calculating tax
        if (gross_pay <= TAX_BRACKET){
            taxable_income = gross_pay - TAX_ALLOWANCE_LOWER;
            if(Character.toString(ms).matches("s") || Character.toString(ms).matches("S")) {
                tax_paid = taxable_income * TAX_SINGLE;
                net_income = gross_pay - tax_paid;
            } else {
                tax_paid = taxable_income * TAX_MARRIED;
                net_income = gross_pay - tax_paid;
            }
        } else {
            taxable_income = gross_pay - TAX_ALLOWANCE_UPPER;
            if(Character.toString(ms).matches("m") || Character.toString(ms).matches("M")) {
                tax_paid = taxable_income * TAX_SINGLE;
                net_income = gross_pay - tax_paid;
            } else {
                tax_paid = taxable_income * TAX_MARRIED;
                net_income = gross_pay - tax_paid;
            }
        }

        eol = in.nextLine();
        System.out.print("Please enter your password: ");
        password = in.nextLine();
        System.out.print("Please re-enter your password: ");
        password_check = in.nextLine();

        while (!password.equals(password_check)){
            System.out.println("Incorrect, Please re-enter your password: ");
            password_check = in.nextLine();
        }

        System.out.printf("%s %s %s %c %.2f %.2f %.2f", emp_id, name, address, ms, gross_pay, net_income, tax_paid);
    }
}
