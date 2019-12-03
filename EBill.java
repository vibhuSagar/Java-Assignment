/* Electricity Bill Calculator */
import java.util.Scanner;


public class EBill{
    
    public static void main(String[] args){
        
	int units;
	double amount;
	   
	System.out.println("Enter the number of units.");
	    
	 Scanner u = new Scanner(System.in);
	  units=u.nextInt();
	    
	    
	    if(units>0 && units<=100){
	        amount=units*5;			// First 100 units
	    }
	    else if(units>0 && units<=200){
	        amount=(units-100)*10 + 500;	// Next 200 Units
	    }
	    else{
	        amount=(units-200)*20 + 2000 + 500;	//Remaining units 
	    }
	    
	    System.out.println("Total Bill Amount = "+ amount);		//Print total amount
    }
}
