import java.util.Scanner;
public class ReverseString {
	public static void main(String args[])
	{
		String s,rev = "";
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		s = in.nextLine();
		int length = s.length();
		for(int i=length - 1; i >=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("Reversed String is: " +rev);
	}

}
