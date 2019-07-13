public class ArraysDS {
    static int[] reverseArray(int[] a) {
        int temp = 0;
        int halfLen = a.length;
        for (int i = 0; i < halfLen/2; ++i) {
            temp = a[halfLen-i-1];
            a[halfLen-i-1] = a[i];
            a[i] = temp;
        }
        return a;
    }
    public static void main(String[]args){
        int [] a = {1,4,3,2};
        int [] reversedArr = reverseArray(a);
        for(int i = 0;i<reversedArr.length;i++){
            System.out.print(reversedArr[i] + " ");
        }
    }

}
