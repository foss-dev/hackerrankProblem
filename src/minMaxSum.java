public class minMaxSum {
    static void miniMaxSum(int[] arr) {
        long minSum = 0;
        long maxSum = 0;
        long totalSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum+=arr[i];
            minSum = totalSum;
        }
        for(int i = 0;i<arr.length;i++){
            long tempMin = totalSum - arr[i];
            if(tempMin<minSum){
                minSum = tempMin;
            }
        }
        for(int i = 0;i<arr.length;i++){
            long tempMax = totalSum - arr[i];
            if(tempMax>maxSum){
                maxSum = tempMax;
            }
        }

        System.out.print(minSum + " " + maxSum);

    }
    public static void main(String[]args){
        int[] arr = {1,2,3,4,5};//sample test case
        miniMaxSum(arr);
    }
}
