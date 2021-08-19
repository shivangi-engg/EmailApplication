package printpackage;
import java.lang.*;
import java.util.*;

public class Email
{
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int defaultPasswordLength = 10;
    private String companySuffix = "company.com";

    //constructor to receive firstname and last name
    public Email(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        //System.out.println("Email Created: "+this.firstname+" "+this.lastname);
        
        //call a method asking for the department which returns the department    
        this.department = setDepartment();  
        //System.out.println("department: "+ this.department);  
    
        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("your password is: "+this.password);
    
        //combine elements to generate email
        email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department+"."+companySuffix;
        //System.out.println("Your email is: "+ email);
    }

    //ask for the department
    private String setDepartment()
    {
        System.out.print("new worker: "+firstname+" "+lastname+"\nenter the department code\n 1 for sales\n 2 for development\n 3 for accounting\n 0 for none\n");
        Scanner in = new Scanner(System.in);
        int depchoice = in.nextInt();
        if(depchoice == 1)
            return "Sales";
        else if(depchoice == 2)
            return "development";
        else if(depchoice == 3)
            return "accounting";
        else
            return "";
    }

    //generate random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXYZ0123456789@#$%";
        char[] password = new char[length];
        for(int i=0; i<length; i++)
        {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        //modifying password[] to be a new string
        return new String(password);
    }

    //set the mailbox capacity
    public void setMailBoxCapacity(int capacity)
    {
        this.mailBoxCapacity = capacity;
    }

    //set alternate email
    public void setAlternateEmail(String altEmail)
    {
        this.alternateEmail = altEmail;
    }

    //change the password
    public void changePassword(String password)
    {
        this.password = password;
    }

    //get methods
    public int getMailBoxCapacity()
    {
        return mailBoxCapacity;
    }
    public String getAlternateEmail()
    {
        return alternateEmail;
    }
    public String getPassword()
    {
        return password;
    }

    public String showInfo()
    {
        return "Display name: "+firstname+" "+lastname+"\n"+
               "company email: "+email+"\n"+
               "mail box capacity: "+mailBoxCapacity+"mb";
    }
}