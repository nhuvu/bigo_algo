package DataAbstraction.ExcellentStudent;

import java.util.Scanner;

public class L10P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudent = scanner.nextInt();
        Student[] students = new Student[numStudent];
        int count = 0;
        for(int i = 0; i < numStudent; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            float math = scanner.nextFloat();
            float lit = scanner.nextFloat();
            students[i] = new Student(name, math, lit);

        }

        for(Student s : students){
            if(s.averagePoint() >= 9.0){
                count++;
            }
        }
        System.out.println(count);
    }
}
