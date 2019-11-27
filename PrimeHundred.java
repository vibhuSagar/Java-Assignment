/* Print prime numbers from 1 to 100 */
class Main
{
	public static void main(String arg[])	
	{
	int i,count;

    System.out.println("Prime numbers between 1 to 100 are ");
	
	for(int j=2;j<=100;j++)
	{
	count=0;			
	{
	   if(j%i==0)			
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.print(j+"  ");     
	}
	}
}
