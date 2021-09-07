import java.util.Scanner;
import java.util.Arrays;

public class SyracuseProblem {
    public static void main (String[] args) {
      // number input and varible declaration
      final String TEXT_YELLOW = "\u001B[33m"; // declarare culoare galben
      final String TEXT_GREEN = "\u001B[32m"; // declarare culoare verde
      final String TEXT_RESET = "\u001B[0m"; // declarare culoare default
      Scanner myObj = new Scanner (System.in);
      System.out.println("Insert number:");
      int n = myObj.nextInt();
      int max=0; // maximum number in series
      int ver=0; // needed in finding max
      int series=1;
      int index = 1; // needed in array
      if (n % 2 == 0){ // check if number is odd or prime
        System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is prime");
      }
      else{
        System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is odd");
      }
      int[] myArray; // array declaration
      myArray = new int[100]; // array length
      myArray[0] = n; // index no 1
      System.out.println(TEXT_GREEN + "Number at index 0 is " + myArray[0] + TEXT_RESET);
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
          ver=n;
        }
        // output in while
        if(n % 2 == 0){
          System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is prime");  
        }
        else{
          System.out.println("Term no. " + series + " is " + TEXT_YELLOW + n + TEXT_RESET + " and is odd");
        }

        myArray[index]=n; // insert n into array
        System.out.println(TEXT_GREEN + "Number at index " + index + " is " + myArray[index] + TEXT_RESET); // display index in array and value
        index++;
      }
      // final statistics
      System.out.println("Total listed numbers: " + count);
      System.out.println("Maximum number in series is: " + max);
    }
  }