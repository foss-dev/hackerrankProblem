public class kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1==x2&&v1==v2){
            return "YES";
        }
        else if(x1==x2&&v1>v2){
            return "NO";
        }
        else if(x1<=x2&&v1<=v2){
            return "NO";
        }
        else if((x2-x1)%(v2-v1)==0){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[]args){
        int x1=0,v1=2,x2=5,v2=3; //sample test case
        System.out.println(kangaroo(x1,v1,x2,v2));
    }
}
