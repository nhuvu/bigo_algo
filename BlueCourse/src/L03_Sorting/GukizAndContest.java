
/**
 * https://codeforces.com/problemset/problem/551/A
 * */
package L03_Sorting;

import java.util.*;

public class GukizAndContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        ArrayList<Student> students = new ArrayList<>();
        scanner.nextLine();
        for(int i = 1; i <= numOfStudents; i++){
            Student s = new Student(i, scanner.nextInt());
            students.add(s);
        }

        //sort Student by grade, in descending order
        students.sort(((o1, o2) -> o2.grade.compareTo(o1.grade)));
        students.get(0).setPosition(1); //the first student has the highest grade, set position #1
        //check and add position for other students behind him
        for (int i = 1; i < numOfStudents; i++){
            if(Objects.equals(students.get(i).grade, students.get(i - 1).grade)){
                students.get(i).setPosition(students.get(i-1).getPosition());
            }else {
                students.get(i).setPosition(i+1);
            }
        }

        //sort again, by id, in ascending order (to put array back to original index & print)
        students.sort((Comparator.comparing(o -> o.id)));
        for (Student s : students){
            System.out.printf("%d ", s.position);
        }
    }
}

class Student{
    Integer id;
    Integer grade;
    Integer position;
    public Student(int id, int grade){
        this.id = id;
        this.grade = grade;
        this.position = 0;
    }

    public int getPosition(){
        return this.position;
    }
    public void setPosition(int i){
        this.position = i;
    }
}
