import javax.swing.JOptionPane;

/*
  This program finds a user's Body Mass Index.
  It also tels them whether it is a healthy level or not.
*/

public class BMI_Calculator_Advanced
{
  public static void main(String[] args)
  {
    double weight;         // User's weight
    double height;         // User's height
    String input;          // To hold inputs
    double bmi;            // User's BMI
    double heightSquared;  // User's height squared
    
    //Welcome the user and inform what program does.
    JOptionPane.showMessageDialog(null, "Hello, human! Today " +
                                     "we will be calculating " +
                                       "your Body Mass Index!");
    
    //Get the user's weight.
    input  = JOptionPane.showInputDialog("Please enter your " +
                                          "weight in pounds.");
    weight = Double.parseDouble(input);

    //Get the user's height.
    input  = JOptionPane.showInputDialog("Please enter your " +
                                          "height in inches.");
    height = Double.parseDouble(input);
    
    //Determine user's BMI
    
    heightSquared = (height * height);
    
    bmi = weight * 703 / heightSquared;
    double bmiRounded  = (double) Math.round(bmi * 10) / 10;
    
    //Tell the user their BMI.  
    JOptionPane.showMessageDialog(null, "By my super advanced " +
                                 "calculations, it looks like " +
                              "your BMI is " + bmiRounded + ".");
    
         // Tell the user whether or not their BMI is healthy.
         if (bmiRounded > 25)
         { 
           JOptionPane.showMessageDialog(null, "You are considered " +
                                  "overweight. Consult your doctor " +
                                        "about weight loss options.");
           
           JOptionPane.showMessageDialog  (null, "Maybe you should " +
                            "consider laying off the cheeseburgers.");
         }
         
         if (bmiRounded <= 25 && bmiRounded >= 18.5)
         {
           JOptionPane.showMessageDialog   (null, "You are considered " +
                                          "to be at an optimal weight!");
           
           JOptionPane.showMessageDialog(null, "You can go for a run! " +
                                                 "Eat a cheeseburger! " + 
                                            "The world is your oyster.");
         }
         
         if (bmiRounded < 18.5)   
         { 
           JOptionPane.showMessageDialog(null, "You are considered " +
                                 "underweight. Consult your doctor " +
                                "about healthy ways to gain weight.");
           
           JOptionPane.showMessageDialog (null,"You can always eat " +
                                        "a couple of cheeseburgers.");
         }
         
      //Thank you outro message.
      JOptionPane.showMessageDialog(null, "Thank you for using " +
                                    "my BMI calculator! Have a " +
                                     "good day. And remember...");
                                    
      JOptionPane.showMessageDialog  (null, "Cheeseburgers are " +
                                                    "delicious!");
      System.exit(0);
   }
  }