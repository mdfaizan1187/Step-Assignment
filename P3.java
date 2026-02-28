// QUE 3. Write a program to convert a given distance in kilometers to miles. (1 mile = 1.6 kilometers)
public class Level_One {
    public static void main(String[] args) {
        double kilometers, miles;
        kilometers = 10.8;
        miles = (1 / 1.6) * kilometers;
        System.out.println("The distance " + kilometers + "km in miles is: " + miles);

    }
}
