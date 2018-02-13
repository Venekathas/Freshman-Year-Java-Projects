import java.util.Scanner;        // For the scanner class
import java.io.*;                // For file I/O classes
import javax.swing.JOptionPane;  // For the JOptionPane class
/**
 * This program will create and fill a 2D array with data from a file. 
 * It will then play with the data. Finding totals, averages, minimums,
 * and maximums per row and column of the Array.
 * 
 * Bradley Smith
 * 4/19/2016
 * CSC 152
 * Winnie Yu
 */
public class ArrayAnarchy
{
  // This main method stores all the returns and the array used for the program. 
  // It also calls the other methods and sets up user inputs.
  public static void main(String[] args) throws IOException
  {
    int[][] numbers = new int[4][5];  // 2D Array that will be filled by the file used later.
    
    String input;                     // Used to store the user's inputs from JOptionPane.
    
    int arrTotal, rowTotal, colTotal, // Used to store the returns on the totals recieved from other methods.
        userRow, userCol,             // Used to store the inputs from the user.
        rowHigh, rowLow;              // Used to store the returns on high/low values from other methods.
    
    double arrAverage;                // Used to store the average returned as a double from another method.
    
    JOptionPane.showMessageDialog(null,
                                  "Hello human! What you will see here will be " +
                                  "like nothing you've seen before!");
    JOptionPane.showMessageDialog(null,
                                  "My powers have grown since my last program!! " +
                                  "Bare witness to my mystical majesty! I will control " +
                                  "even more methods to play with even more pointless data!");
    JOptionPane.showMessageDialog(null,
                                  "First, we pull some numbers out of a hat! Or...file.");
    
    // This calls the first method to send the array address
    //in order to be filled with numbers from a file.
    getValues(numbers);
    
    JOptionPane.showMessageDialog(null,
                                  "Look at that fancy table. Notice the periods at the end. " +
                                  "My own...personal touch. You want the total next? Well look below!");
    
    // This calls the second method to get the total of the entire 2D Array and returns it.
    arrTotal = getTotal(numbers);
    
    // Prints the total.
    System.out.println("The total is " + arrTotal + ".");
    
    JOptionPane.showMessageDialog(null,
                                  "Such a handsome total. But if you think " +
                                  "that's nice you should see the average!");
    
    // This calls the third method to get the average number of the 2D Array values and returns it.
    arrAverage = getAverage(arrTotal);
    
    // Prints the average.
    System.out.println("The average is " + arrAverage + ".");
    
    JOptionPane.showMessageDialog(null,
                                  "For my next trick, I will need a volunteer. " +
                                  "I guess you will have to do.");
    
    // This asks the user which row they would like to count.
    input  = JOptionPane.showInputDialog("Which row do you want to count? " +
                                         "Your options are 1 - 4.");
    userRow = Integer.parseInt(input);
    userRow -= 1;
    
    // After recieving input from the user, it sends that input
    //to the next method which gets the row total.
    rowTotal = getRowTotal(numbers, userRow);
    
    // Prints the total value for the row specified.
    System.out.println("The total for row " + (userRow + 1) + " is " + rowTotal + ".");
     
    // This asks the user which column they would like to count.
    input  = JOptionPane.showInputDialog("Now which column do you want to count? " +
                                         "Your options are 1-5.");
    userCol = Integer.parseInt(input);
    userCol -= 1;
    
    // After recieving input from the user, it sends that input
    //to the next method which gets the column total.
    colTotal = getColTotal(numbers, userCol);
    
    // Prints out the total value for the column specified.
    System.out.println("The total for column " + (userCol + 1) + " is " + colTotal + ".");
    
    JOptionPane.showMessageDialog(null,
                                  "'But Program,' you might ask, 'What if I want to know " +
                                  "the highest number in a row?' I can do that too!");
    
    // This asks the user which row they want to get the highest number from.
    input  = JOptionPane.showInputDialog("Which row did you have in mind?");
    userRow = Integer.parseInt(input);
    userRow -= 1;
    
    // After recieving input from the user, it sends that input
    //to the next method which gets the highest number in a row.
    rowHigh = getHighestInRow(numbers, userRow);
    
    // Prints the highest number in the row specified.
    System.out.println("The highest number in row " + (userRow + 1) + " is " + rowHigh + ".");
    
    JOptionPane.showMessageDialog(null,
                                  "And let me guess, before you even ask..." + 
                                  "You want the lowest number as well?");
    
    // This asks the user which row they want to get the lowest number from.
    input  = JOptionPane.showInputDialog("Well. Pick another row! Or the same, it matters not.");
    userRow = Integer.parseInt(input);
    userRow -= 1;
    
    // After recieving input from the user, it sends that input
    //to the next method which gets the lowest number in a row.
    rowLow = getLowestInRow(numbers, userRow);
    
    // Prints the lowest number in the row specified.
    System.out.println("The lowest number in row " + (userRow + 1) + " is " + rowLow + ".");
    
    JOptionPane.showMessageDialog(null,
                                  "Thank you. Thank you. I appreciate your applause! " +
                                  "Now don't try this at home kids....");
    JOptionPane.showMessageDialog(null,
                                  "For my last trick, I will make myself...");
    JOptionPane.showMessageDialog(null,
                                  "DISAPPEAR!");
    System.exit(0);
  } 
  /** 
     This method opens up a declared file, and extracts the numbers and populates the array.
     @param array The 2D Array address to put values into.
  */
  public static void getValues(int[][] array)  throws IOException
  {
    String filename; // Required to create the file name.
    
    filename = ("discord.txt"); // Declared since input not required for project.
    
    // Opens the file and lets the file write into the array.
    File file = new File(filename);
    Scanner inputFile = new Scanner(file);
      
    //This loop progresses through the numbers in the file and writes them to the 2D Array.
     
    while (inputFile.hasNext())
    for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
             array[row][col] = inputFile.nextInt(); 
      }
    // Closes the file.
    inputFile.close();
    
    // A loop to display the array elements.
    for(int row = 0; row < 4; row++)  
    { 
      System.out.println("Row " + (row + 1));
      for (int col = 0; col < array[row].length - 1; col++)  // This will run all of the numbers in
        System.out.print(array[row][col] + ", ");            // the column except for the last one.
      
      System.out.println(array[row][4] + ".");               // This runs the last number in the column.
    }
  }
  /**
   * This method gets the total of all the numbers in the 2D array, and returns that value.
   * @param array The address of the array to be totalled.
   * @return The total of the array values.
   */
  public static int getTotal(int[][] array)
  {
    int total = 0; // Initializes total for the counter.
   
    // Goes through the entire 2D Array adding the subscripts together.
    for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[row].length; col++)
           total += array[row][col]; 
      }  
    // Returns the total.
    return total;
  }
  /** 
   * This method gets the average value of all the numbers
   * in the 2D Array using the previously found total.
   * @param total The total found from the previous method.
   * @return The average of the Array values.
   */
  public static double getAverage(int total)
  {
    double average;
    // This finds the average by dividing the total by the number of subscripts in the 2D Array.
    average = total / 20.0;
    
    // Returns the average.
    return average;
  }
 
  /**
   * This method gets the total of a row specified by the user and returns that value.
   * @param array The array address.
   * @param row The row specified by the user.
   * @return The total of the values in the row.
   */
  public static int getRowTotal(int[][] array, int row)
  {
    int total = 0; // Initializes total for the counter.
      
    for (int col = 0; col < array[row].length; col++)
    { 
       total += array[row][col]; 
    }
     // Returns the total for the row specified by the user.
    return total;
  }
  /**
   * This method gets the total of a column speicified by the user and returns the value.
   * @param array The address of the array.
   * @param col The column specified by the user.
   * @return The total of the column.
   */
  public static int getColTotal(int[][] array, int col)
  {
    int total = 0; // Initializes the total for counting.
      
    for (int row = 0; row < array.length; row++)
    { 
       total += array[row][col]; 
    }
    // Returns the total.
    return total;
  }
  /**
   * Finds the highest number in a user specified row, then returns that value.
   * @param array The address of the array.
   * @param row The row specified by the user.
   * @return The highest number in that row.
   */
  public static int getHighestInRow(int[][] array, int row)
  {
    int max = array[row][0]; // This initializes the max as the first subscript in the array.
   
    // This loop goes through the array finding the highest number by comparing it with
    // the previously found maximum.  
    for(int col = 0; col < array[row].length; col++)
    {
      if(array[row][col] > max)
      max = array[row][col];
    }   
    // Returns the maximum to the main method.
    return max;
  } 
  /** 
   * Gets the lowest value in a user speicifed row and returns that value.
   * @param array The address of the array.
   * @param row The user specified row.
   * @return The lowest value in the row.
   */
  public static int getLowestInRow(int[][] array, int row)
  {
    int min = array[row][0]; // This initializes the min as the first subscript in the array.
    
    // This loop goes through the array finding the lowest number by comparing it with
    // the previously found minimum.
    for (int col = 0; col < array[row].length; col++)
    {
      if(array[row][col] < min)
      min = array[row][col];
    }
    // Returns the minimum to the main method.
    return min; 
  }
}