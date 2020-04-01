package 二叉树;

public class BinaryTree {
    //根节点
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public  void frontShow(){
        if (root==null){
            return;
        }
        root.frontShow();
    }

    public void midshow() {
        if (root==null){
            return;
        }
        root.midshow();

    }

    public void Lastshow() {
        if (root==null){
            return;
        }
        root.Lastshow();
    }
}
