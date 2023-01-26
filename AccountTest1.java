/* 
Name: Kennedy Keyes
Date: September 12, 2021
Program: AccountTest1.java
Description: This program will create and manipulate an Account object.
 */
package accounttest1;
import java.util.Scanner;

/**
 *
 * @author codingken
 */
public class AccountTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create a Scanner object to obtain input from user
        Scanner input = new Scanner(System.in);
        
        // Create an Account object and assign it to myAccount
        Account1 myAccount = new Account1();
        
        // Display initial value of name (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        
        // Prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // Read a line of text
        myAccount.setName(theName); // Put theName in myAccount
        System.out.println(); // Outputs a blank line
        
        // Display the name stored in object myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", 
                myAccount.getName());
    }
    
}
