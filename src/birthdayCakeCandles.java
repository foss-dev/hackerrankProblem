public class birthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        int tallNumber = 0;
        int tallestOne = ar[0];
        for(int i = 0;i<ar.length;i++){
            if(ar[i]>tallestOne){
                tallestOne = ar[i];
            }
        }
        for(int i = 0;i<ar.length;i++){
            if(ar[i]==tallestOne){
                tallNumber+=1;
            }
        }

        return tallNumber;

    }
    public static void main(String []args){
        int[] arr = {3,2,1,3}; //sample test case
        System.out.println(birthdayCakeCandles(arr));
    }
}
