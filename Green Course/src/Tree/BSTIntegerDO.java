package Tree;

public class BSTIntegerDO {
    NodeIntegerDO root;
    public BSTIntegerDO(){
        this.root = null;
    }

    public void addToBST(int x){
        if(this.root == null){
            NodeIntegerDO p = new NodeIntegerDO(x);
            this.root = p;
        } else {
            root.addToNode(x);
        }
    }

    public int minBST(){
        return root.minNode();
    }

    public void printIncrementBST() {
        root.printIncrementNode();
    }

    public int sumOfLeafSBST(){
        return root.sumOfLeafNode();
    }

    public int countFullBST(){
        return root.countNodeHaveTwoChildren();
    }

    public int sumValueBST(int x){
        return root.sumValueNode(x);
    }

    public int calculateHeightOfBST(){
        return this.root.calculateHeight();
    }
}
