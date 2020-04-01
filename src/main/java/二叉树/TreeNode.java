package 二叉树;

public class TreeNode {
    //节点的权
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void frontShow() {
        System.out.println(value);
        if (leftNode!=null){
            leftNode.frontShow();
        }
        if (rightNode!=null){
            rightNode.frontShow();
        }
    }

    public void midshow() {
        //4 2 5 1 6 3 7
        if (leftNode!=null){
            leftNode.midshow();
        }
        System.out.println(value);
        if (rightNode!=null){
            rightNode.midshow();
        }

    }

    public void Lastshow() {
        //4 5 2 6 3 7 1
        if (leftNode!=null){
            leftNode.Lastshow();
        }

        if (rightNode!=null){
            rightNode.Lastshow();
        }
        System.out.println(value);
    }
}
