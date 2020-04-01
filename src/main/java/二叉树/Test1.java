package 二叉树;
import org.testng.annotations.Test;
public class Test1 {

    @Test
    public void testBinaryTree(){
        BinaryTree binaryTree=new BinaryTree();
        TreeNode root=new TreeNode(1);
        binaryTree.setRoot(root);
        TreeNode rootLeftNode=new TreeNode(2);
        TreeNode rootRightNode=new TreeNode(3);
        root.leftNode=rootLeftNode;
        root.rightNode=rootRightNode;
        rootLeftNode.leftNode=new TreeNode(4);
        rootLeftNode.rightNode=new TreeNode(5);
        rootRightNode.leftNode=new TreeNode(6);
        rootRightNode.rightNode=new TreeNode(7);
        //binaryTree.frontShow();
        binaryTree.midshow();
        binaryTree.Lastshow();
        int a=5;
        int b=9;
        
    }
}
