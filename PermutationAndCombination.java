import java.util.Scanner;
 
public class PermutationAndCombination
{
    public static int fact(int num){
        int fact=1, i;
        for(i=1; i<=num; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        int n, r;
        Scanner in = new Scanner(System.in);
 
        System.out.print("Enter Value of n : ");
        n = in.nextInt();
        System.out.print("Enter Value of r : ");
        r = in.nextInt();
 
        System.out.println("Combination is " +(fact(n)/(fact(n-r)*fact(r))));
        System.out.println("Permuation is " +(fact(n)/(fact(n-r))));
    }
}