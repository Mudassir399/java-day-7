
import java.util.*;
class TwoPairOfArray
{
	public static void main (String[] args) 
	{
	    Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int l=0;
            int h=n-1;
            boolean g=false;
			while(l<h)
            {
               int sum=arr[l]+arr[h];
               if(sum==k)
               {
                g=true;
                break;
               }
               else if(sum<k)
               {
                l++;
               } 
               else
               {
                h--;
               } 
            }
            System.out.println(g);
        
    }
}            
   
