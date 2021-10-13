import java.util.*;
import javax.swing.*;

public class SyracuseProblem {
    public static void main (String[] args) {
      // number input and varible declaration
      final String TEXT_YELLOW = "\u001B[33m"; // declarare culoare galben
      final String TEXT_GREEN = "\u001B[32m"; // declarare culoare verde
      final String TEXT_RESET = "\u001B[0m"; // declarare culoare default
      
      int n = Integer.parseInt(JOptionPane.showInputDialog("Enter your number."));


      int max=0; // maximum number in series
      int series=1;
      int index = 1; // needed in array

      if (n % 2 == 0){ // check if number is odd or prime
        System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is prime");
      }
      else{
        System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is odd");
      }
      
      ArrayList<Integer> myList = new ArrayList<Integer>(); //create and arraylist
      myList.add(n);

      System.out.println(TEXT_GREEN + "Number at index 0 is " + myList.get(0) + TEXT_RESET);
      int count = 1;

      while (n != 1){
        // main if
        if(n % 2 == 0){
          n = n / 2;
        }
        else{
          n *= 3;
          n = n + 1;
        }

        count++; // times in while
        series++;

        // finding max in series
        if(n>max){
          max=n;
        }
        else{
        }

        // output in while
        if(n % 2 == 0){
          System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is prime");  
        }
        else{
          System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is odd");
        }

        myList.add(n); // insert n into arraylist
        System.out.println(TEXT_GREEN + "Number at index " + index + " is " + myList.get(index) + TEXT_RESET); // display index in array and value
        index++;
      }

      // final statistics
      JOptionPane.showMessageDialog(null, "The numbers are: " + myList);
      JOptionPane.showMessageDialog(null, "The maximum number in series is " + max + ".");
      JOptionPane.showMessageDialog(null, "There are " + count + " numbers in series.");
    }
  }