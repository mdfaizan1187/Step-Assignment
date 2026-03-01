// QUE 2. Write a program to calculate the average marks of a student in three subjects: Mathematics, Physics, and Chemistry.
public class Level_One {
    public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;
        int total = maths + physics + chemistry;
        double average = total / 300.0;
        System.out.println("Sam's Average Marks in PCM is: " + average);
    }
}
