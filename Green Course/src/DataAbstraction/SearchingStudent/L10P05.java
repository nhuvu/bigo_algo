package DataAbstraction.SearchingStudent;

import java.util.Scanner;

public class L10P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudent = scanner.nextInt();
        int numQuery = scanner.nextInt();
        Student[] students = new Student[numStudent];
        Student[] result = new Student[numQuery];
        for(int i = 0; i < numStudent; i++){
            scanner.nextLine();
            int num = scanner.nextInt();
            float math = scanner.nextFloat();
            float lit = scanner.nextFloat();
            students[i] = new Student(num, math, lit);
        }
        for (int i = 0; i < numQuery; i++){
            scanner.nextLine();
            int num = scanner.nextInt();
            for (Student s : students){
                if(s.queryStudentByNumber(num) != null){
                    result[i] = s;
                }
            }
        }

        for(Student s : result){
            System.out.println(s);
        }

    }
}
