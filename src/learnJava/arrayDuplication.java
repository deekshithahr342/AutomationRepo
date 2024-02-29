package learnJava;

public class arrayDuplication {
    public static void main(String[] args)
    {
    	int[] duplicateArray = {1,2,3,4,5,4,3,2,1,1,1};
    	
//    	for(int i =0;i<duplicateArray.length;i++)
//    	{
//    		for(int j=i+1;j<duplicateArray.length;j++)
//    		{
//    			if(duplicateArray[i]==duplicateArray[j])
//    			{
//    				System.out.println(duplicateArray[i]);
//    			}
//    		}
//
//}
    	
    	for(int i=0;i<duplicateArray.length;i++) {
    		for (int j=i+1;j<duplicateArray.length;j++) {
    		  if(duplicateArray[i]==duplicateArray[j]) {
				System.out.println(duplicateArray[i]);
				
    			     if(duplicateArray1[i]!=duplicateArray1[i])
    				{
    				System.out.println(duplicateArray1[i]);
    			}
    			}
    		}
    	}
    	
    }
    
}

