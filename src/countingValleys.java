public class countingValleys {
    static int countingValleys(int n, String s) {
        int valleyCount = 0;
        int seaLevel = 0;
        for(char c : s.toCharArray()){
            if(c == 'U') ++seaLevel;
            if(c == 'D') --seaLevel;

            // if we just came UP to sea level
            if(seaLevel == 0 && c == 'U')
                ++valleyCount;
        }
        return valleyCount;
    }

    public static void main(String[]args){
        String s = "UDDDUDUU";
        int n = s.toCharArray().length;
        System.out.println(countingValleys(n,s));
    }
}
