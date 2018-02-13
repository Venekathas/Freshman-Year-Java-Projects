import java.util.Scanner;        // For the scanner class
import java.io.*;                // For file I/O classes
import javax.swing.JOptionPane;  // For the JOptionPane class
/*
 * This program finds a file that has a set of numbers used to populate an array. 
 * It will then find the average, minimum, and maximum values of the array and display the results.
 * 
 * Bradley Smith
 * 4/8/2016
 * CSC 152
 * Winnie Yu
 */

public class MethodChaos
{
 
  public static void main(String[] args)  throws IOException
  {
    int[] numbers = new int[20]; // Creates an array that fits the 20 required subscripts.
    
    double avg;      // Used to catch the average from another method.
    int min, max;    // Used to catch the min and max from another method.
   
    JOptionPane.showMessageDialog(null, "Today is a special day human. My skills are being " +
                                        "put to the test! Today I'll control all these methods " +
                                        "to collect seemingly pointless data. Behold!");
    
    JOptionPane.showMessageDialog(null, "For my first trick, I will pull random numbers from a file!");
    // Calls a method to populate array.
    getValues(numbers);
    
    JOptionPane.showMessageDialog(null, "Now watch, as I reveal the average, minimum, and maximum " +
                                        "numbers! For what reason you ask? No reason at all!!");
    // Calls a method to get the average of the array values.
    avg = getAverage(numbers);
    
    // Calls a method to find the smallest number in the array.
    min = getMinimum(numbers);
    
    // Calls a method to find the largest number in the array.
    max = getMaximum(numbers);
    
    //Calls a method to display all the results.
    displayResults(avg, min, max);
   
  } 
  // This method opens up a declared file, and extracts the numbers and populates the array.
  public static void getValues(int[] array)  throws IOException
  {
    
    String filename; // Required to create the file name.
    
    filename = ("discord.txt"); // Declared since input not required for project.
    
    // Opens the file and lets the file write into the array.
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);
      
    // This loop progresses through the numbers in the file and writes them to the array.
    while (inputFile.hasNext())
    { 
      for (int index = 0; index < array.length; index++)
      {
       array[index] = inputFile.nextInt(); 
      }
    }
    
    // Closes the file.
    inputFile.close();
    
    // A loop to display the array elements.
     for (int index = 0; index < array.length-1; index++)
     {  
       System.out.print(array[index] + ", ");
     }
     System.out.print(array[array.length-1] + ".");
  }
  // A method to take the numbers from the array and find the average of them.
  public static double getAverage(int[] array)
  {
    
    double total = 0; // Initializes the total to be ready to accumulate.
    double average;   // Declares the average as a double to be sent to the main method.
    
    // This loop progresses through the array and adds the values together.
    for (int index = 0; index < array.length; index++)
    { 
      total += (array[index]);
    }
    
    // After the values have been totalled, this divides them by a double to make it
    // real division. This gives the accurate average.
    average = (total / 20.0);
    
    // Returns the average back to the main method.
    return average;
    
    System.out.print("hi");

  }
  // This method finds the lowest number in the array and returns it to the main method.
  public static int getMinimum(int[] array)
  {
    
    int min =array[0]; // This initializes the min as the first subscript in the array.
    
    // This loop goes through the array finding the lowest number by comparing it with
    // the previously found minimum.
    for(int i = 1; i < array.length; i++)
    {
      if(array[i] < min)
      min = array[i];
    }
    
    // Returns the minimum to the main method.
    return min;
  }
  // This method finds the highest number in the array and returns it to the main method.
  public static int getMaximum(int[] array)
  {
    int max = array[0]; // This initializes the max as the first subscript in the array.
    
    // This loop goes through the array finding the highest number by comparing it with
    // the previously found maximum.
    for(int i = 1; i < array.length; i++)
    {
      if(array[i] > max)
      max = array[i];
    }
    
    // Returns the maximum to the main method.
    return max;
  }
  // This method displays the results found throughout the program, then the entire array.
  public static void displayResults(double avg, int min, int max)
  {
     
    System.out.println(" ");
    System.out.println("The average number in the array is " + avg + ".");
    System.out.println("The smallest number in the array is " + min + ".");
    System.out.println("The largest number in the array is " + max + ".");
    
    JOptionPane.showMessageDialog(null, "Impressed? I would be too. This was no easy task!");
  }
}
    