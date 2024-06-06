package Tree;

public class NodeIntegerDO {
    int data;
    NodeIntegerDO left;
    NodeIntegerDO right;

    public NodeIntegerDO(int x){
        this.data = x;
        this.left = null;
        this.right = null;
    }

    public void addToNode(int x){
        if(x < this.data){
            if(this.left == null){
                NodeIntegerDO p = new NodeIntegerDO(x);
                left = p;
            } else {
                left.addToNode(x);
            }
        } else if (x > this.data) {
            if(this.right == null){
                NodeIntegerDO p = new NodeIntegerDO(x);
                right = p;
            } else {
                right.addToNode(x);
            }
        } else {
            //do nothing
        }
    }

    public int minNode(){
        if(this.left == null){
            return this.data;
        } else {
            return left.minNode();
        }
    }

    public void printIncrementNode() {
        if (this.left != null) {
            this.left.printIncrementNode();
        }
        System.out.printf("%d ", this.data);
        if (this.right != null) {
            this.right.printIncrementNode();
        }
    }

    public int sumOfLeafNode(){
        if(this.left == null && this.right == null){
            return this.data;
        } else if (this.left == null) {
            return this.right.sumOfLeafNode();
        } else if (this.right == null) {
            return this.left.sumOfLeafNode();
        } else {
            return (this.left.sumOfLeafNode() + this.right.sumOfLeafNode());
        }
    }

    public static int count = 0;
    public int countNodeHaveTwoChildren(){
        if(this.left != null){
            this.left.countNodeHaveTwoChildren();
        }
        if(this.right != null){
            this.right.countNodeHaveTwoChildren();
        }
        if (this.left != null && this.right != null){
            count++;
        }
        return count;
    }

    public int sumValueNode(int x){
        if(this.left != null){
            this.left.sumValueNode(x);
        }
        if(this.right != null){
            this.right.sumValueNode(x);
        }
        if(this.data < x){
            count += this.data;
        }
        return count;
    }
    
    public int calculateHeight(){
        int leftHeight = 0, rightHeight = 0;
        if(this == null){
            return 0;
        }
        if(this.left != null){
            leftHeight = this.left.calculateHeight();
        }
        if(this.right != null){
            rightHeight = this.right.calculateHeight();
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
