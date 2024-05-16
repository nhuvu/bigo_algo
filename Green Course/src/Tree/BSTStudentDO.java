package Tree;

public class BSTStudentDO {
    NodeStudentDO root;

    public BSTStudentDO(){
        this.root = null;
    }

    public void addToBST(Student s){
        if(this.root == null){
            NodeStudentDO p = new NodeStudentDO(s);
            this.root = p;
        } else {
            this.root.addToNode(s);
        }

    }
    public Student highestScoreBST(){
        return this.root.highestScore();
    }
}
