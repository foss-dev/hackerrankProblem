import java.util.*;
public class diagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sumLeft = 0;
        int sumRight = 0;
        int rows = arr.size();
        int columns = arr.get(0).size();
        int i = 0;
        int j = 0;
        int k = 0;
        int l = arr.size()-1;
        while(i<rows&&j<columns&&k<rows&&l>=0){
            sumLeft+=arr.get(i).get(j);
            sumRight+=arr.get(k).get(l);
            i+=1;
            j+=1;
            k+=1;
            l-=1;
        }

        return Math.abs(sumLeft-sumRight);
    }
    public static void main(String[]args){
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        //sample test case
        arr.get(0).add(0,11);
        arr.get(0).add(1,2);
        arr.get(0).add(2,4);
        arr.get(1).add(0,4);
        arr.get(1).add(1,5);
        arr.get(1).add(2,6);
        arr.get(2).add(0,10);
        arr.get(2).add(1,8);
        arr.get(2).add(2,-12);


        System.out.println(diagonalDifference(arr));

    }
}
