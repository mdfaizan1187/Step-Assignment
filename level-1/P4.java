// QUE 4. Write a program to calculate the profit and profit percentage of a product, given its cost price and selling price.
public class Level_One {
    public static void main(String[] args) {
        int costprice = 129, sellingprice = 191;
        int profit = sellingprice - costprice;
        int profitpercent = (profit * 100) / costprice;
        System.out.println("The cost price is INR " + costprice + " and the selling price is INR " + sellingprice);
        System.out.println("The profit is INR " + profit + " and the profit percentage is " + profitpercent + "%");
    }
}
