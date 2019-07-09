import java.util.ArrayList;
import java.util.List;

public class bonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
        for(int i=0;i<bill.size();i++){
            sum+=bill.get(i);
        }
        int actual=(sum-bill.get(k))/2;
        if (b==actual)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-actual);
    }
    public static void main(String[]args){
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(bill,1,12);
    }
}
