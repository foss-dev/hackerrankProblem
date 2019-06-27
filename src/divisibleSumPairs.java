public class divisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int sum=0,count=0;
        for(int i = 0; i<ar.length;i++){
            for(int j = i+1;j<ar.length;j++){
                sum = 0;
                sum+=ar[i]+ar[j];
                if(sum%k==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        int[] ar = {1,3,2,6,1,2};
        int n = ar.length;
        int k = 3;
        System.out.println(divisibleSumPairs(n,k,ar));
    }
}
