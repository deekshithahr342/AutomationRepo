package learnJava;

public class fibboNumbers {
	
	/*public static void main(String[] args)
	{
		int n1 = 0 , n2=1,n;
		int count =10;
		System.out.println(n1+" "+n2);
		
		for(int i=0;i<count;i++)
		{
			n=n1+n2;
			System.out.println(""+n);
			n1=n2;
			n2=n;
		}
	}*/
	
	static int n1=0,n2=1, n3=0;
	static void printfib(int count)
	{
	if(count>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(""+n3);
		printfib(count-1);
	}
	}
	public static void main(String[] args)
	{
		int count=10;
		System.out.println(n1+""+n2);
		printfib(count-2);
		
	}
}
	  
		/* static int n1=0,n2=1,n3=0;    
		 static void printFibonacci(int count){    
		    if(count>0){    
		         n3 = n1 + n2;    
		         n1 = n2;    
		         n2 = n3;    
		         System.out.print(" "+n3);   
		         printFibonacci(count-1);    
		     }    
		 }    
		 public static void main(String args[]){    
		  int count=10;    
		  System.out.print(n1+" "+n2);//printing 0 and 1    
		  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
		 }  
		} */


