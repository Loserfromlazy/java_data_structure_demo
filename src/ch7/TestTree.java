package ch7;

/**
 * 测试树的方法
 */
public class TestTree {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(52);
        tree.insert(63);
        tree.insert(75);
        tree.insert(73);
        tree.insert(76);
        tree.insert(90);
        tree.insert(74);
/*        System.out.println(tree.root.data);
        System.out.println(tree.root.leftChild.data);
        System.out.println(tree.root.rightChild.data);
        System.out.println(tree.root.leftChild.leftChild.data);*/

//        Node node = tree.find(15);
//        System.out.println("....."+node.data);
        tree.inOrder(tree.root);
        System.out.println();
        tree.delete(70);
        tree.inOrder(tree.root);
    }

}
