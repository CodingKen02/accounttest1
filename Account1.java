/*
Name: Kennedy Keyes
Date: September 12, 2021
Program: Account1.class
Description: This is the Account class that contains a name instance
variable and methods to set and get its value.
 */
package accounttest1;

/**
 *
 * @author codingken
 */
public class Account1 
{
    // Declare instance variable
    private String name;
    
    // Create set method to set the name in the object
    public void setName(String name)
    {
        // Store the name entered from the application into the method
        this.name = name;
        
    }
    
    // Create get method to retrieve the name from the object
    public String getName()
    {
        return name; // Return value of name to the caller
    }
}
