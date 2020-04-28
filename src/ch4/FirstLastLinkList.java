package ch4;

/**
 * @author Loserfromlazy
 * 双端链表
 */
public class FirstLastLinkList {
	//头节点
	private Node first;
	//尾节点
	private Node last;
	//节点的个数
	private int size;
	public FirstLastLinkList() {
		first=null;
	}
	
	/**
	 * 插入一个节点，在头节点后进行插入
	 */
	public void insertFirst(Object value) {
		Node node = new Node(value);
		if(size==0) {
			first=node;
			last= node;
		}else {
			node.next=first;
			first=node;
		}
		size++;
	}
	/**
	 * 插入一个节点，从尾节点进行插入
	 */
	public void insertLast(Object value) {
		Node node = new Node(value);
		if(size==0) {
			first=node;
			last=node;
		}else {
			last.next=node;
			last=node;
		}
		size++;
	}
	/**
	 * 删除一个节点，在头节点后进行删除
	 */
	public Node deleteFirst() {
		Node node= first;
		if(first.next==null) {
			last=null;
		}else {
			first=node.next;
		}
		
		size--;
		return node;
	}
	
	public void display() {
		Node current =first;
		while(current!=null) {
			current.display();
			current=current.next;
		}
		System.out.println();
	}
	
	/**
	 * 查找结点
	 */
	public Node find(Object value) {
		Node current =first;
		int tempSize=size;
		while(tempSize>0) {
			if(value.equals(current.data)){
				return current;
			}else {
				current=current.next;
			}
			tempSize--;
		}
		
		return null;
	}
	
	/**
	 * 删除节点，根据数据域进行删除
	 */
	public boolean delete(Object value) {
		if(size==0) {
			return false;
		}
		Node current =first;
		Node previous =first;
		while(current.data!=value) {
			if(current.data==null) {
				return false;
			}else {
				previous=current;
				current =current.next;
			}
		}
		if(current==first) {
			first=current.next;
			size--;
		}else {
			previous.next=current.next;
			size--;
		}
		return true;
	}
	public boolean isEmpty() {
		if(size==0) {return false;}
		return true;
	}
}
