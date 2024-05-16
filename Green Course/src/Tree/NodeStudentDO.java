package Tree;

public class NodeStudentDO {
    Student data;
    NodeStudentDO left;
    NodeStudentDO right;

    public NodeStudentDO (Student s){
        this.data = s;
        this.left = null;
        this.right = null;
    }

    public void addToNode(Student s){
        if(s.score < this.data.score){
            if(this.left == null){
                NodeStudentDO p = new NodeStudentDO(s);
                this.left = p;
            } else {
                this.left.addToNode(s);
            }
        } else if(s.score > this.data.score){
            if(this.right == null){
                NodeStudentDO p = new NodeStudentDO(s);
                this.right = p;
            } else {
                this.right.addToNode(s);
            }
        }
    }

    public Student highestScore(){
        if(this.right == null){
            return this.data;
        } else {
            return this.right.highestScore();
        }
    }
}
