package DataAbstraction.OldestEmployee;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class L10P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployee = scanner.nextInt();
        Employee[] employees = new Employee[numEmployee];
        for(int i = 0; i < numEmployee; i++){
            scanner.nextLine();
            String num = scanner.next();
            String name = scanner.next();
            int year = scanner.nextInt();
            employees[i] = new Employee(num, name, year);
        }
        int minBirthYear = findSmallestBirthYear(employees);
        int minNum = findOldest(employees,minBirthYear);
        for(Employee e : employees){
            if(e.queryEmployeeByNum(minNum) != null){
                System.out.println(e);
            }
        }
    }

    public static int findSmallestBirthYear(Employee[] employees){
        int minBirthYear = employees[0].birthYear;
        for(int i = 0; i < employees.length; i++){
            if(minBirthYear >= employees[i].birthYear){
                minBirthYear = employees[i].birthYear;
            }
        }
        return minBirthYear;
    }
    public static int findOldest(Employee[] employees, int year){
        Stream<Employee> em = Arrays.stream(employees);
        Employee[] filtered = em.filter(e -> (e.birthYear == year)).toArray(Employee[]::new);
        int minNum = Integer.valueOf(filtered[0].num);
        for(Employee e : filtered){
            if(minNum >= Integer.valueOf(e.num)){
                minNum = Integer.valueOf(e.num);
            }
        }
        return minNum;
    }
}
