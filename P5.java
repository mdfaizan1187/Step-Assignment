// QUE 5. Write a program to calculate the number of pens each student will get if 14 pens are distributed equally among 3 students, and also calculate the number of remaining pens that cannot be distributed.
public class Level_One {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int pensperstudent = pens / students;
        int remainingpens = pens % students;
        System.out.println("The Pen Per Student is: " + pensperstudent + " and the remaining pens not distributed is: "
                + remainingpens);

    }
}
