package exercise2;

import java.util.Scanner;

public class EvenOrOddNumber  {

  public static void main (String[] args) {
    System.out.println("Gerade oder ungerade Zahl:");
    Scanner input = new Scanner (System.in);
    int number= input.nextInt();
    if (number%2==0){
      System.out.println("Even");
    }
    else if(number%2==1){
      System.out.println("Odd");
    }
  }
}    
