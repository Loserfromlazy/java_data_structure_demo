package ch7;

/**
 * 二叉树节点
 */
public class Node {
    //数据项
    long data;
    //左子节点
    Node leftChild;
    //右子节点
    Node rightChild;

    public Node(long data){
        this.data=data;
    }
    //输出数据项
    public void display(){
        System.out.println(data);
    }
}
