import java.util.*;
public class staircase {
    static void staircase(int n) {
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if((i+j)>n){
                    System.out.print('#');
                }
                else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int stairFloor = input.nextInt();
        staircase(stairFloor);
    }
}
