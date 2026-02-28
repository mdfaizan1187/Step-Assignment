// QUE 9. Write a program to calculate the profit and profit percentage of a product, given its cost price and selling price, using user input.
import java.util.Scanner;

public class Level_One {
    public static void main(String[] args) {
        int fee, discountpercent, actualfee = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        fee = input.nextInt();
        System.out.print("Enter the discount percentage: ");
        discountpercent = input.nextInt();
        int discount = (fee * discountpercent) / 100;
        actualfee = fee - discount;
        System.out
                .println("The discount amount is INR " + discount + " and the final discount fee  is INR " + actualfee);

    }
}
