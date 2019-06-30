import java.util.ArrayList;
import java.util.List;

public class migratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        int[] countArr = new int[5];
        for (int i = 0; i < arr.size(); i++) {
            switch (arr.get(i)) {
                case 1:
                    countArr[0]++;
                    break;
                case 2:
                    countArr[1]++;
                    break;
                case 3:
                    countArr[2]++;
                    break;
                case 4:
                    countArr[3]++;
                    break;
                case 5:
                    countArr[4]++;
                    break;
            }
        }
        int highest = 0;
        int answer = 0;
        for(int i = 0;i<countArr.length;i++){
            if(countArr[i]>highest){
                highest = countArr[i];
                answer= i+1;
            }
        }
        return answer;
    }
    public static void main(String []args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println(migratoryBirds(arr));
    }
}
