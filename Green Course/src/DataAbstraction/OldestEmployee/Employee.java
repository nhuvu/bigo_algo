package DataAbstraction.OldestEmployee;

public class Employee {
    String num;
    String name;
    int birthYear;

    public Employee (String num, String s, int year){
        this.num = num;
        this.name = s;
        this.birthYear = year;
    }
    public Employee queryEmployeeByNum(int num){
        if(num == Integer.valueOf(this.num)){
            return this;
        }
        return null;
    }
    @Override
    public String toString() {
        return String.format("%s %s %d", this.num, this.name, this.birthYear);
    }
}
