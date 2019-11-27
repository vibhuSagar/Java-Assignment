/* Check Whether a number is prime or not */

import java.util.Scanner;

public class Prime {
    
    
    public static void main(String[] args) {
        
        int num;
        
        boolean flag = false;
        
        System.out.println("Enter a number.");      // input a number
        Scanner n= new Scanner(System.in);
        num=n.nextInt();
        
        
        for(int i = 2; i <= num/2; i++)
        {
             
            if(num % i == 0)        // condition to check a nonprime number
            {
                flag = true;
                break;
            }
        }
        
        if (!flag)
            System.out.println(num + " is a prime number.");        // print number is prime
        else
            System.out.println(num + " is not a prime number.");        // print number is not prime
    }
}
