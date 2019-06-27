public class simpleArraySum {
    private static int sum(int[] ar) {
        int sum = 0;
        for(int i=0;i<ar.length;i++) sum += ar[i];
        return sum;
    }
    public static void main(String[]args){
        int[] ar = {1,2,3,4,5}; //sample test case
        System.out.println(sum(ar)); //prints screen
    }
}
