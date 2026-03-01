// QUE 7. Write a program to calculate the volume of a sphere given its radius, and then convert the volume from cubic kilometers to cubic miles. (1 mile = 1.6 kilometers)
public class Level_One {
    public static void main(String[] args) {
        double radius = 6378;
        double volume = (4 / 3.0) * 3.14 * radius * radius * radius;
        double km = 1 / 1.6;
        System.out.printf("The volume of the sphere in kilometers is %.2f and the distance in miles is %.2f", volume,
                (volume * km));
    }
}
