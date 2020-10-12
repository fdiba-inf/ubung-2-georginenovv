package exercise2;

import java.util.Scanner;

public class SumOfDigits {

  public static void main (String[] args) {
    System.out.println("Eine Zahl zwischen 0 und 999 eingeben:");
    Scanner input = new Scanner (System.in);
    int number= input.nextInt();
    int d1=number%10;
    int a=number/10;
    int d2=a%10;
    int a2= a/10;
    int d3=a2%10;
    System.out.println(d1+d2+d3);
  
  }
}