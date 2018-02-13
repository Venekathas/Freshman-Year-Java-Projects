import java.util.Scanner;       // Needed for the Scanner class
import javax.swing.JOptionPane; // Needed for JOptionPane class


/*
   This program caluclates a customer's monthly bill
   after selecting from one of three data plans.
*/

public class DataPlans
{
  public static void main(String[] args)
  {
    String input;     // Holds input value by customer.
    char dataPackage; // Holds user's selection of plan.
    int gigs;         // Holds user's data usage in gigs.
    double bill;      // Holds the calculated bill of plan.
    
    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);
    
    //Welcomes the user and informs what the program does.
    JOptionPane.showMessageDialog(null,"Hello human! Today " +
                        "I will be helping you select what " +
                               "data plan is right for you!");
    JOptionPane.showMessageDialog(null,"We offer three packages " +
                      "to humans like yourself. They are simply " +
                                        "labeled as A, B, and C.");
    
     //Proceed to ask how much data they need, if need be.
    input = JOptionPane.showInputDialog("Before we proceed, " +
                              "I need to know how many gigs " +
                               "you plan on using per month!");
    gigs  = Integer.parseInt(input);
    
    //Asks the user to select a data plan.
    input = JOptionPane.showInputDialog("Good! And which plan are you " +
                                          "interested in today, human?");
    dataPackage = input.charAt(0);
   
   

    // Calculate and display the cost of each plan.
    // Also tells user if another plan would be more cost effective.
    switch(dataPackage)
      {
         case 'a':
         case 'A':
            bill = (gigs - 1) * 5 + 10;
            JOptionPane.showMessageDialog(null,"Using " + gigs +
                       " gigs per month, your bill would be $" +
                                        bill + " every month.");
            
            JOptionPane.showMessageDialog(null,"You are paying $10 "+
                                   "for the plan and $5 for every " + 
                                        "gig used after the first.");
            if (gigs < 5 && gigs > 3)
              JOptionPane.showMessageDialog(null,"I would suggest " +
                                          "switching to plan B so " +
                                           "you only have to pay $" +
                                ((gigs - 2) * 3 + 20) + " a month.");
            if (gigs >= 5)
              JOptionPane.showMessageDialog(null,"I would suggest " +
                                      "switching to plan C so you " +
                                    "only have to pay $30 a month!");
            break;
         case 'b':
         case 'B':
            bill = (gigs - 2) * 3 + 20;
            JOptionPane.showMessageDialog(null,"Using " + gigs +
                       " gigs per month, your bill would be $" +
                                        bill + " every month.");
            JOptionPane.showMessageDialog(null,"You are paying $20 "+
                                   "for the plan and $3 for every " + 
                                       "gig used after the second.");
            if (gigs <= 3)
              JOptionPane.showMessageDialog(null,"I would suggest " +
                                          "switching to plan A so " +
                                           "you only have to pay $" +
                                ((gigs - 1) * 5 + 10) + " a month.");
            if (gigs >= 6)
              JOptionPane.showMessageDialog(null,"I would suggest " +
                                      "switching to plan C so you " +
                                    "only have to pay $30 a month!");
            
            break;
         case 'c':
         case 'C':
           JOptionPane.showMessageDialog(null," You can use as " +
                                 "much data as you want and it " +
                              "would only cost $30 every month!");
           if (gigs <= 3)
             JOptionPane.showMessageDialog(null,"But since you only use " +
                                       gigs + " gigs a month, you would " +
                                            "be better off using plan A " +
                            " at $" + ((gigs - 1) * 5 + 10) + " a month.");  
                                        
           if (gigs > 3 && gigs <= 5)
             JOptionPane.showMessageDialog(null,"But since you only use " +
                                       gigs + " gigs a month, you would " +
                                            "be better off using plan B " +
                            " at $" + ((gigs - 2) * 3 + 20) + " a month.");
            break;
         default:
            JOptionPane.showMessageDialog(null,"ERROR. ERROR! ERROR!!");
            JOptionPane.showMessageDialog(null,"What, are you trying " +
                                      "to kill me? Put in A, B, or C!");
            
            System.exit(0);
      }
   }
}