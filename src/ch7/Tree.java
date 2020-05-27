package ch7;

/**
 * 二叉树类
 */
public class Tree {
    //根节点
    public Node root;

    /**
     * 插入节点
     * @param value
     */
    public void insert(long value){
        //封装节点
        Node newNode = new Node(value);
        //引用当前节点
        Node current =root;
        //引用父节点
        Node parent;
        //如果root为null，第一次插入时
        if (root == null){
            root = newNode;
        }else {
            while (true) {
                //父节点指向当前节点
                parent = current;
                //如果当前节点数据比插入的大，则向左走
                if (current.data > value) {
                    current = current.leftChild;
                    if (current == null){//如果左子节点为空
                        parent.leftChild = newNode;//插入新值，返回
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null){//如果右子节点为空
                        parent.rightChild = newNode;//插入新值，返回
                        return;
                    }
                }
            }
        }
    }

    /**
     * 查找节点
     * @param value
     */
    public Node find(long value){
        //引用当前节点，从根节点开始
        Node current = root;
        //循环，查找值不等于当前节点的数据项
        while (current.data != value){
            //比较当前节点大小与查找值
            if (current.data > value){
                current = current.leftChild;
            }else if(current.data < value) {
                current =current.rightChild;
            }else {
                return null;
            }
        }
        return current;
    }

    /**
     * 前序遍历
     * @param localNode
     */
    public void frontOrder(Node localNode){
        if (localNode != null){
            //访问根节点
            System.out.println(localNode.data+" ");
            //前序遍历左子树
            frontOrder(localNode.leftChild);
            //前序遍历右子树
            frontOrder(localNode.rightChild);
        }
    }

    /**
     * 中序遍历
     * @param localNode
     */
    public void inOrder(Node localNode){
        if (localNode != null){
            //中序遍历左子树
            frontOrder(localNode.leftChild);
            //访问根节点
            System.out.println(localNode.data+" ");
            //中序遍历右子树
            frontOrder(localNode.rightChild);
        }
    }
    /**
     * 后序遍历
     * @param localNode
     */
    public void afterOrder(Node localNode){
        if (localNode != null){
            //后序遍历左子树
            frontOrder(localNode.leftChild);
            //后序遍历右子树
            frontOrder(localNode.rightChild);
            //访问根节点
            System.out.println(localNode.data+" ");
        }
    }

    /**
     * 查找中序后继节点
     * @param delNode
     * @return
     */
    public Node getSuccessor(Node delNode){
        Node successor =delNode;
        Node successorParent = delNode;
        Node current =delNode.rightChild;

        while (current != null){
            successorParent = successor;//保存父节点的引用
            successor =current;//保存当前节点的引用
            current = current.leftChild;
        }
        //将中序后继节点与删除节点替换
        if (successor != delNode.rightChild){
            successorParent.leftChild = successor.rightChild;//如果这个中序后继节点还有右子节点，将他变成这个中序后继节点位置
            successor.rightChild = delNode.rightChild;
        }
        return successor;
    }
    /**
     * 删除节点
     * @param value
     */
    public boolean delete(long value){
        //引用当前节点
        Node current =root;
        //引用当前节点父节点
        Node parent = root;
        //判断是否是左子节点
        boolean isLeftChild = false;
        //查找节点
        while (current.data!= value){
            parent=current;
            if (current.data > value){
                current = current.leftChild;
                isLeftChild = true;
            }else if(current.data < value) {
                current =current.rightChild;
                isLeftChild = false;
            }else {
                return false;
            }
        }

        //删除节点
        if (current.leftChild == null && current.rightChild ==null){//删除叶子节点，该节点没有子节点
            if (current == root){
                root = null;
            }
            //如果是父节点的左子节点
            else if (isLeftChild){
                parent.leftChild=null;
            }else {
                parent.rightChild=null;
            }
            return true;
        }else if (current.rightChild == null){//如果节点只有一个左节点
            if (current == root){//跳过待删除节点，让待删除节点的左子节点变成根节点
                root=current.leftChild;
            }
            else if (isLeftChild){//如果待删除节点是左子节点，让父节点的左子节点等于待删除节点的左子节点
                parent.leftChild=current.leftChild;
            }else {//如果待删除节点是右子节点，让父节点的右子节点等于待删除节点的左子节点
                parent.rightChild=current.leftChild;
            }
            return true;
        }else if (current.leftChild == null){//如果节点只有一个右节点
            if (current == root){//跳过待删除节点，让待删除节点的右子节点变成根节点
                root=current.rightChild;
            }else if (isLeftChild){//如果待删除节点是左子节点，让父节点的左子节点等于待删除节点的右子节点
                parent.leftChild =current.rightChild;
            }else {
                parent.rightChild=current.rightChild;
            }
            return true;
        }else {//如果有两个子节点
            Node successor =getSuccessor(current);
            if (current == root){
                root =successor;
            }else if (isLeftChild){
                parent.leftChild=successor;
            }else {
                parent.rightChild=successor;
            }
            successor.leftChild=current.leftChild;

        }
        return false;
    }
}
