/**
 * 
 */
package emailapp;

import java.util.Scanner;

/**
 * @author Sanelisiwe Ntini
 *
 */
public class Email
{

    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 10;
    private String department;
    private String email;
    private int mailBoxCapacity;
    private String alternateEmail;
    private String companySuffix = "anycompany.com";

    /**
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void doEverything()
    {
        setDepartment();
        randomPassword(defaultPasswordLength);
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        showInfo();
    }

    public void setMailBoxCapacity(int capacity)
    {
        this.mailBoxCapacity = capacity;
    }

    public void changePassword(String password)
    {
        this.password = password;
    }

    private void randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%^&";
        char[] password = new char[length];

        for (int i = 0; i < length; i++)

        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        this.password = new String(password);
    }

    private void setDepartment()
    {

        System.out.println("Enter the Department for new employee " + firstName + " " + lastName
                + "\n1 for Sales\n2 for Development\n3 for Accounting\n4 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1)
        {
            department = "sales";
        }
        else if (depChoice == 2)
        {
            department = "dev";
        }
        else if (depChoice == 3)
        {
            department = "acct";
        }
        in.close();
    }

    public void showInfo()
    {
        System.out.println("DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL:" + email
                + "\nMAILBOX CAPACITY: " + mailBoxCapacity + "KB");
    }

    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Email [firstName=");
        builder.append(firstName);
        builder.append(", lastName=");
        builder.append(lastName);
        builder.append(", email=");
        builder.append(email);
        builder.append("]");
        return builder.toString();
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public int getDefaultPasswordLength()
    {
        return defaultPasswordLength;
    }

    public void setDefaultPasswordLength(int defaultPasswordLength)
    {
        this.defaultPasswordLength = defaultPasswordLength;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getAlternateEmail()
    {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail)
    {
        this.alternateEmail = alternateEmail;
    }

    public String getCompanySuffix()
    {
        return companySuffix;
    }

    public void setCompanySuffix(String companySuffix)
    {
        this.companySuffix = companySuffix;
    }

    public int getMailBoxCapacity()
    {
        return mailBoxCapacity;
    }

    // constructor to receive the first name and last name

    // ask for the department

    // generate random password

    // set the mailbox capacity

    // set the alternate email
}
