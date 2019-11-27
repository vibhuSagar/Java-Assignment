/* Largest Of Three Numbers */
import java.util.Scanner;


public class LargestOfThree{
    
    public static void main(String[] args){
        
		System.out.println("Enter the value of a,b,c");

		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();

		if (a > b && a > c) {		//Check for a
			System.out.println(a + " is the largest number"); 	//print a is largest

		} else if (b > a && b > c) {		//Check for b
			System.out.println(b + " is the largest number");		//print b is largest
	
		} else {
			System.out.println(c + " is the largest number");		//print c is largest
			
		}    
    }
}
