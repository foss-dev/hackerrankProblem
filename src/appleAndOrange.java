public class appleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount=0;
        for(int i = 0; i<apples.length;i++){
            apples[i] = apples[i]+a;
        }
        for(int i = 0; i<oranges.length;i++){
            oranges[i] = oranges[i]+b;
        }
        for(int i = 0;i<apples.length;i++){
            if(apples[i]>=s&&apples[i]<=t){
                appleCount++;
            }
        }
        for(int i = 0;i<oranges.length;i++){
            if(oranges[i]>=s&&oranges[i]<=t){
                orangeCount++;
            }
        }
        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

    public static void main(String[]args){
        //sample test case
        int s = 7;
        int t = 10;
        int a = 4;
        int b = 12;
        int[] apples = {2,3,-4};
        int[] oranges = {3,-2,-4};
        countApplesAndOranges(s,t,a,b,apples,oranges);
    }
}
