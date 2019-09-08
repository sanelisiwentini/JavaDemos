/**
 * @(#)Student.java
 *
 * Created July 4, 2019.
 *
 */
package studentDatabaseApp;

import java.util.Scanner;

/**
 * Student.
 *
 * @since July 4, 2019
 * @author Sanelisiwe Ntini -
 */
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentId;
    private String courses="";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor prompt users to enter student name and year
    public Student()
    {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name");
        this.lastName = in.nextLine();
        System.out.println("Enter student Grade Year\n1 for Freshman\n2 for Sphomore\n3 for Junior\n4 for Senior");
        this.gradeYear = in.nextInt();
        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentId);

    }

    // generate ID
    private void setStudentId()
    {
        id++;
        this.studentId = gradeYear + "" + id;
    }

    // enroll in courses
    public void enroll()
    {
        // Get inside a loop, user hits 0 when done
        do
        {

            System.out.print("Enter course to enroll, Q to quit");

            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q"))
            {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else
            {
                break;
            }
        } while (1 != 0);
    }

    // Pay tuition.
    public void viewBalance()
    {
        System.out.println("Your Tuition Balace is $" + tuitionBalance);
        
    }
    
    public void payTuition( ) 
    {
        viewBalance();
        System.out.print("Enter tuition payment amount: $");
        Scanner in = new Scanner(System.in);
        int payment=in.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.print("Thank you for your payment of $"+payment);
        viewBalance();
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(firstName);
        builder.append(" ");
        builder.append(lastName);
        builder.append(" \nstudentId: ");
        builder.append(studentId);
        builder.append(" \ncourses: ");
        builder.append(courses);
        builder.append(" \ntuitionBalance=$");
        builder.append(tuitionBalance);
        return builder.toString();
    }

    // Show status
}
