import java.util.Scanner;

class fibonacci {
  public static void main(String[] args) {
	  
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the value upto which fibonacci series is to be generated: ");
	  int n = in.nextInt();

    int a = 0, b = 1;
    System.out.println("Fibonacci Series till " + n + " terms:");

    for (int i = 1; i <= n; ++i) {
    	System.out.print(a + ", ");
      

      // compute the next term
      int c = a + b;
      a = b;
      b = c;
    }
    
  }
}