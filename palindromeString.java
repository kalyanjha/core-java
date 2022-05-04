import java.util.*;   
class palindromeString
{  
   public static void main(String args[])  
   {  
      String s, rev = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string to check if it is a palindrome: ");  
      s = in.nextLine();   
      int length = s.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         rev = rev + s.charAt(i);  
      if (s.equals(rev))  
         System.out.println("The string is a palindrome.");  
      else  
         System.out.println("The string isn't a palindrome.");   
   }  
}  