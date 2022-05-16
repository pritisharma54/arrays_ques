//https://classroom.codingninjas.com/app/practice/2245719/14489/fair-indexes
public class Solution 
{
    public static int totalIndexes(int[] a, int[] b)
    {
        // Write your code here.
        int n=a.length;
        long sum1=0,sum2=0;
        int count=0;
        
        long [] preva= new long[n];
        long[] prevb=  new long[n];
      
        
        for(int i=0;i<n;i++){
            sum1+=a[i];
            sum2+=b[i];
           
           if(i!=0){   
            preva[i]=preva[i-1]+a[i];
            prevb[i]=prevb[i-1]+b[i];
                
            }
            else{
                preva[i]=a[i];
        		prevb[i]=b[i];
            }
           
                
        }
        
        for(int i=0;i<n-1;i++){
           if(preva[i]==prevb[i]&&sum1==2*preva[i]&&sum2==2*prevb[i])
               	count++;
                
        }
        
        return count;
        
        
    }
}
