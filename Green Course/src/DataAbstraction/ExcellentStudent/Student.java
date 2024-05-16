package DataAbstraction.ExcellentStudent;

public class Student {
    String name;
    float mathPoint;
    float literaturePoint;

    public Student (String s, float math, float lit){
        this.name = s;
        this.mathPoint = math;
        this.literaturePoint = lit;
    }

    public float averagePoint(){
        return (this.mathPoint + this.literaturePoint) / 2;
    }
}
