/**
 * @(#)StudentDatabaseApp.java
 *
 * Created July 4, 2019.
 *
 */
package studentDatabaseApp;

import java.util.Scanner;

/**
 * StudentDatabaseApp.
 *
 * @since July 4, 2019
 * @author Sanelisiwe Ntini -
 */
public class StudentDatabaseApp
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // Ask how many users to add

        // Create n number of new students

        System.out.print("Enter number of students to enroll:");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();

        Student[] students = new Student[numStudents];
        for (int i = 0; i < numStudents; i++)
        {
            students[i] = new Student();;
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());
        }
    }

}
