import printpackage.*;
import java.lang.*;
import java.util.*;

public class EmailApplication
{
    public static void main(String[] args)
    {
        Email em1 = new Email("john","smith");

        //em1.setMailBoxCapacity;
        //em1.setAlternateEmail;
        //em1.changePassword;

        // em1.setAlternateEmail("js@gmail.com");
        //System.out.println(em1.getAlternateEmail());
    
    	System.out.println(em1.showInfo());
    }
}