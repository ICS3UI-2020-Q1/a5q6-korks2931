import java.util.Scanner;
/**
 *This program will print out rows of lines of * in the size of the 
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number between 1 and 10");
    int userNumber = input.nextInt();
     // make a for loop 
    for (int count = 1; count <= userNumber; count = count + 1){
    
      // make a for loop inside of a loop 
      for(int countTwo = 2; countTwo <= userNumber; countTwo = countTwo + 1){
        // print it out to the screen
      System.out.print ("*");
      }
      // print it out to the screen
      System.out.println("*");
        
        
    }

    
  }
}
