// QUE 6. Write a program to calculate the discount amount and the final discounted price of a product, given its original price and the discount percentage.
public class Level_One {
    public static void main(String[] args) {
        int fee = 125000, discountpercent = 10, actualfee = 0;
        int discount = (fee * discountpercent) / 100;
        actualfee = fee - discount;
        System.out
                .println("The discount amount is INR " + discount + " and the final discount fee  is INR " + actualfee);

    }
}
