package Tree;

public class Student {
    String id;
    String name;
    float score;

    public Student (String id, String name, float score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.id, this.name, this.score);
    }
}
