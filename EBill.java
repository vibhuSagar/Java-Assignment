import java.util.Scanner;


public class EBill{
    
    public static void main(String[] args){
        
	 int units;
	double amount;
	    System.out.println("Enter the number of units.");
	    
	    Scanner u = new Scanner(System.in);
	    units=u.nextInt();
	    
	    
	    if(units>0 && units<=100){
	        amount=units*5;
	    }
	    else if(units>0 && units<=200){
	        amount=(units-100)*10 + 500;
	    }
	    else{
	        amount=(units-200)*20 + 2000 + 500; 
	    }
	    
	    System.out.println("Total Bill Amount = "+ amount);
    }
}