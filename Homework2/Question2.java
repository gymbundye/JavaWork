import java.util.Scanner;   
class Question2 {  
   public static void main(String args[]) {
       //variables//
      String forwards; 
      String backwards = "";  
      //forinput//
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter for Palindrome check!");  
      forwards = in.nextLine(); 
      //loop checks for samee charecters//  
      int length = forwards.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         backwards = backwards + forwards.charAt(i);  
         //prints the check//
      if (forwards.equals(backwards))  
         System.out.println(forwards+" is a palindrome!");  
      else  
         System.out.println(forwards+" isn't a palindrome!");   
   }  
}