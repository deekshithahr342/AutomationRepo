package learnJava;

public class generate_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i , j, row=5;//i=row j=column
		
		for(i=0;i<=row;i++)//outer loop for row
		{
			for(j=1;j<=i;j++)//inner loop for clumn
			{
				System.out.println("*");
				
			}
			System.out.println();
		}
	}

}
