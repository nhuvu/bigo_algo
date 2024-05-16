package DataAbstraction.SearchingStudent;

public class Student {
    int number;
    float mathPoint;
    float literaturePoint;

    public Student (int num, float math, float lit){
        this.number = num;
        this.mathPoint = math;
        this.literaturePoint = lit;
    }


    public Student queryStudentByNumber(int number){
        if(number == this.number){
            return this;
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("%.1f %.1f", this.mathPoint, this.literaturePoint);
    }
}
