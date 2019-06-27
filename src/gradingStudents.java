import java.util.*;
public class gradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> lastGrades = new ArrayList<>();
        for(int i = 0; i<grades.size();i++){
            int rounded = (grades.get(i) + 4) / 5 * 5;
            if(grades.get(i)<38) {
                int grade = grades.get(i);
                lastGrades.add(grade);
            }
            else if(rounded-grades.get(i)<3){
                grades.set(i,rounded);
                lastGrades.add(grades.get(i));
            }
            else if(rounded-grades.get(i)==3){
                int grade = grades.get(i);
                lastGrades.add(grade);
            }
            else if(rounded-grades.get(i)>3){
                int grade = grades.get(i);
                lastGrades.add(grade);
            }
        }
        return lastGrades;
    }
    public static void main(String[]args){
        List<Integer> grades = new ArrayList<>();
        //sample test case
        grades.add(23);
        grades.add(80);
        grades.add(96);
        grades.add(18);
        List<Integer> lastGrades = gradingStudents(grades);

        for(int i = 0; i<lastGrades.size();i++){
            System.out.println(lastGrades.get(i));
        }

    }
}
