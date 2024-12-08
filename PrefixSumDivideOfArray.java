import java.util.*;
public class PrefixSumDivideOfArray 
{
    public static void main(String[] args) 
    {

        int arr[]={11,2,3,4,3};
        int s=0;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
            int res=s/(i+1);
            arr[i]=res;
        }    
            System.out.println(Arrays.toString(arr));
    }
        
}
 