import java.util.*;
public class compareTheTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoint=0;
        int bobPoint=0;
        List<Integer> pointList = new ArrayList<>();
        for(int i=0;i<3;i++){
            int aliceScore = a.get(i);
            int bobScore = b.get(i);
            if(aliceScore!=bobScore){
                int temp = aliceScore>bobScore ? alicePoint++ : bobPoint++;
            }
        }
        pointList.add(alicePoint);
        pointList.add(bobPoint);

        return pointList;

    }
    public static void main(String[]args){
        //sample test case
        List<Integer> aliceScores = new ArrayList<>();
        List<Integer> bobScores = new ArrayList<>();

        aliceScores.add(17);
        aliceScores.add(28);
        aliceScores.add(30);
        bobScores.add(99);
        bobScores.add(16);
        bobScores.add(8);

        List<Integer> totalScores = compareTriplets(aliceScores,bobScores);

        for(int i = 0;i<totalScores.size();i++){
            System.out.print(totalScores.get(i) + " ");
        }
    }
}
