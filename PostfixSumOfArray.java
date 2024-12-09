import java.util.*;
public class PostfixSumOfArray 
{
    public static void main(String[] args) 
    {

        int arr[]={11,2,3,4,3};
        int m=arr.length;
        int post[]=new int[m];
        post[0]=arr[(arr.length-1)];
        m--;
        for(int i=1;i<arr.length;i++)
        {
            m--;
            post[i]=post[i-1]+arr[m];
            
        }
        System.out.println(Arrays.toString(post));    
    }
        
}
 