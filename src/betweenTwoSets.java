import java.util.ArrayList;
import java.util.List;

public class betweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count=0;
        List<Integer> d = new ArrayList<>();
        for(int x=1;x<101;x++){
            int c=0;
            for(int i=0;i<a.size();i++) {
                if(x%a.get(i)==0&&x>=a.get(i)){
                    c++;
                }
            }
            if(c==a.size()){
                d.add(x);
            }
        }
        for(int j=0;j<d.size();j++){
            int c=0;
            for(int i=0;i<b.size();i++){
                if(b.get(i)%d.get(j)==0){
                    c++;
                }
            }
            if(c==b.size()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[]args){
        //sample test case
        int aElementCount = 3;
        int bElementCount = 2;
        List<Integer> a = new ArrayList<>(aElementCount);
        a.add(3);
        a.add(9);
        a.add(6);
        List<Integer> b = new ArrayList<>(bElementCount);
        b.add(36);
        b.add(72);

        System.out.print(getTotalX(a,b));
    }
}
