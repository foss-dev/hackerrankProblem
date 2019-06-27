import java.util.ArrayList;
import java.util.List;

public class birthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int sum = 0,count=0;
        if(m<=s.size()){
            for (int i = 0; i<m;i++){
                sum+=s.get(i);
            }
            if(sum==d){
                count++;
            }
        }
        for(int i = 0;i<s.size()-m;i++){
            sum = sum - s.get(i) + s.get(i+m);
            if(sum==d){
                count++;
            }
        }
        return count;

    }
    public static void main(String[]args){
        List<Integer> s = new ArrayList<>();
        //sample test case
        s.add(1);
        s.add(4);
        int d = 4;
        int m = 1;

        System.out.println(birthday(s,d,m));
    }
}
