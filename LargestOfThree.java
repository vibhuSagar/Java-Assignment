import java.util.Scanner;


public class LargestOfThree{
    
    public static void main(String[] args){
        
		System.out.println("Enter the value of a,b,c");

		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		int b = n.nextInt();
		int c = n.nextInt();

		if (a > b && a > c) {
			System.out.println(a + " is the largest number");

		} else if (b > a && b > c) {
			System.out.println(b + " is the largest number");
	
		} else {
			System.out.println(c + " is the largest number");
			
		}
        
    }
}