
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   

          Scanner scan = new Scanner(System.in);
       /* Write your code here */
      System.out.println("Please enter a three digit number:");
      
      int a = scan.nextInt();
      

     
      
      
      
      
      
      System.out.println("Here are the digits:");
        
      int h = a % 10;
      int b = a / 10 % 10;
     int c = a / 100;
     
      System.out.println(h);
     
      System.out.println(b);
     
      System.out.println(c);
      



  }
}