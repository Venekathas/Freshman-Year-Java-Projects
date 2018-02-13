import java.util.Scanner;       // Needed for the Scanner class
import javax.swing.JOptionPane; // Needed for JOptionPane class

/*
 * Bradley Smith
 * CSC 152-02
 * Programming Project #3: Nested Loops - Rainfall Counter
 * 
 * This program asks and collects data on how much rain has fallen over the course of a user defined number of years.
 * It validates for proper inputs and tells the user the average rainfall per month.
*/

public class RainfallCounter
{
  public static void main(String[] args)
    
  {
    String input;      // Used to hold inputs from JOptionPane.
    String[] months = {"January", "February", "March", "April", "May", "June", "July", // An array to refer to
                       "August", "September", "October", "November", "December"};      // the months of each year.
    int numYears,      // Number of years input by user.
        numMonths,     // Number of months relative to years input by user.
        userRain,      // Amount of rain in inches.
        totalRain = 0, // The total amount of rain over the years, initialized to 0 for counting.
        rpmAverage;    // Holds the calculated amount of rain per year.
    
     // Used to input data.
     Scanner keyboard = new Scanner(System.in);
     
     // Welcomes the user and informs what the program does.
     JOptionPane.showMessageDialog(null," Hello human! Today we will be calculating how much" +
                                        " rainfall you have been getting every month on average.");
     
     // Asks how many years we are collecting data from.
     JOptionPane.showMessageDialog(null," First, I need to know how many years we are" +
                                        " considering in our calculations!");
     
     // Takes input and converts it to data type int.
     input = JOptionPane.showInputDialog(null," How far back in time are we going, human?");
     numYears = Integer.parseInt(input);
     numMonths = numYears * 12;
     
     // Directs user to the interactions box.
     JOptionPane.showMessageDialog(null," No problem. So we need the information for the previous " +
                                        numMonths + " months. Enter the information below!");
     
     //Validates that the user puts at least 1 year.
     if (numYears > 0)
     {
       // Cycles through the years.
       for (int year = 1; year <= numYears; year++)
       {
         // Cycles through the months.
         for (int month = 1; month <= 12; month++)
         {
           // Header to help user keep track of their inputs.
           System.out.println("Year " + year);
           System.out.println("-------");
              
         
           {
             // Asks and gets the input for each month. 
             System.out.print("Enter amount of rainfall in inches for " + (months[month - 1]) + ": ");
             userRain = keyboard.nextInt();
             totalRain += userRain; // Adds user entries to a total counter.
             
             // Validates the userRain data to be greater than -1.
             if (userRain < 0)
             { 
               // Error message if rain validation failed.
               JOptionPane.showMessageDialog(null," ERROR! ERROR!! ERROR!!!");
               JOptionPane.showMessageDialog(null," You can't have negative rain! Try again.");
               System.exit(0);
             }
           }
         }
       }
     }
     else
     { 
      // Error message if year validation failed.
      JOptionPane.showMessageDialog(null," ERROR! ERROR!! ERROR!!!");
      JOptionPane.showMessageDialog(null," There needs to be at least one year!");
      System.exit(0);
     }
   // Calculates the average rainfall over the months.
   rpmAverage = totalRain / numMonths;
     
   // Tells the user the results.
   JOptionPane.showMessageDialog(null," Okay human. Over " + numMonths + " months, there" +
                                         " has been " + totalRain + " inches of rain in total.");
      
   JOptionPane.showMessageDialog(null," On average there has been " + rpmAverage + 
                                         " inches of rain per month.");
   
   // Farewell to the user.
   JOptionPane.showMessageDialog(null," Thank you for using my rainfall counter program!");
   JOptionPane.showMessageDialog(null," Remember to bring an umbrella with you.");
  
 }
}

      
     
