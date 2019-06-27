public class breakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int maxChangeCount = 0;
        int minChangeCount = 0;
        int max = scores[0];
        int min = scores[0];
        for(int i = 0;i<scores.length;i++){
            if(scores[i]>max){
                max = scores[i];
                maxChangeCount++;
            }
            if(scores[i]<min){
                min = scores[i];
                minChangeCount++;
            }
        }
        int[] arr = {maxChangeCount,minChangeCount};
        return arr;
    }
    public static void main(String[]args){
        int[] scores = {3,4,21,36,10,28,35,5,24,42};
        int[] changeCount = breakingRecords(scores);
        for(int i = 0;i<changeCount.length;i++){
            System.out.print(changeCount[i] + " ");
        }
    }
}
