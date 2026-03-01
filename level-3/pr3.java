//Que 3. Write a Java program to calculate the total salary of an employee after adding the bonus to the basic salary.
import java.util.Scanner;
public class Codes_Level_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary,bonus;
        System.out.println("Enter the salary: ");
        salary = sc.nextInt();
        System.out.println("Enter the bonus: ");
        bonus = sc.nextInt();
        int total_salary = salary + bonus;
        System.out.println("The salary is INR: " + salary+" and bonus is INR: " + bonus + " so the total salary is INR: " + total_salary);
    }
}
