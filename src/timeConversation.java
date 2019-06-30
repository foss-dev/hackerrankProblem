public class timeConversation {
    static String timeConversion(String s) {
        String [] tempArray = s.split(":");
        String hours = tempArray[0];
        String minutes = tempArray[1];
        String seconds = tempArray[2].substring(0, 2);

        int tempHours;

        if (tempArray[2].substring(2, 4).equalsIgnoreCase("PM")) {
            if (Integer.parseInt(hours) < 12) {
                tempHours = Integer.parseInt(hours);
                tempHours += 12;
                hours = Integer.toString(tempHours);
            }
        }
        if (tempArray[2].substring(2, 4).equalsIgnoreCase("AM")) {
            if (Integer.parseInt(hours) == 12) {
                hours = "00";
            }
        }
        return hours + ":" + minutes + ":" + seconds;
    }
    public static void main(String[]args){
        String s = "07:05:45PM"; //sample test case
        System.out.println(timeConversion(s));
    }
}