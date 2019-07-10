import java.util.Arrays;

public class sockMerchant {
    static int sockMerchant(int n, int[]ar) {
        Arrays.sort(ar);
        int pairs=0;
        for(int i=0;i<n-1;i++)
        {
            if(ar[i]==ar[i+1])
            {
                ++pairs;
                ++i;
            }
        }
        return pairs;
    }
    public static void main(String[]args){
        int[] ar = {10,20,20,10,10,30,50,10,20};
        System.out.println(sockMerchant(ar.length,ar));
    }
}
