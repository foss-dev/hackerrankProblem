public class plusMinus {
    static void plusMinus(int[] arr) {
        double zeroNumber = 0;
        double plusNumber = 0;
        double minusNumber = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                minusNumber+=1.0;
            }
            else if(arr[i]>0){
                plusNumber+=1.0;
            }
            else{
                zeroNumber+=1.0;
            }
        }

        double zeroFraction = zeroNumber/(double)arr.length;
        double plusFraction = plusNumber/(double)arr.length;
        double minusFraction = minusNumber/(double)arr.length;

        System.out.println(plusFraction);
        System.out.println(minusFraction);
        System.out.println(zeroFraction);
    }

    public static void main(String []args){
        int[] arr = {-4,3,-9,0,4,1}; //sample test case
        plusMinus(arr);
    }
}
