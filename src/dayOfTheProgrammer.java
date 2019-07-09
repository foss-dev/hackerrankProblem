public class dayOfTheProgrammer {
    static String dayOfProgrammer(int year) {
        if((year <= 1917) & (year%4 == 0) || ((year > 1918) & (year%400 == 0) || ((year%4 == 0) & (year%100 != 0))))
            return "12.09." +year;
        else if(year==1918)
            return "26.09." +year;
        else
            return "13.09." +year;
    }
    public static void main(String[]args){

        // sample test case
        // in 1918, on russian calenda february start from 14, so the 256th day is 26.09.1918
        int year = 2200;
        System.out.println(dayOfProgrammer(year));
    }
}
