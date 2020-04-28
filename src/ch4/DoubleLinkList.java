package ch4;

/**
 * @author Loserfromlazy
 * 双向链表
 */
public class DoubleLinkList {
	//头节点
	private DoubleNode first;
	//尾节点
	private DoubleNode last;
	//节点的个数
	private int size;
	public DoubleLinkList() {
		first=null;
		size=0;
		last=null;
	}
	
	/**
	 * 插入一个节点，在头节点后进行插入
	 */
	public void insertFirst(Object value) {
		DoubleNode node = new DoubleNode(value);
		if(size==0) {
			first=node;
			last= node;
		}else {
			first.previous=node;
		}
		node.next=first;
		first=node;
		size++;
	}
	/**
	 * 插入一个节点，从尾节点进行插入
	 */
	public void insertLast(Object value) {
		DoubleNode node = new DoubleNode(value);
		if(size==0) {
			first=node;
			last=node;
		}else {
			last.next=node;
			node.previous=last;
			last=node;
		}
		size++;
	}
	/**
	 * 删除一个节点，在头节点后进行删除
	 */
	public DoubleNode deleteFirst() {
		DoubleNode node= first;
		if(first.next==null) {
			last=null;
		}else {
			first.next.previous=null;
			
		}
		first=node.next;
		size--;
		return node;
	}
	/**
	 * 删除节点，从尾部进行删除
	 */
	public DoubleNode deleteLast() {
		DoubleNode node= last;
		if(first.next==null) {
			first=null;
		}else {
			last.previous.next=null;
			
		}
		last=last.previous;
		size--;
		return node;
	}
	public void display() {
		DoubleNode current =first;
		while(current!=null) {
			current.display();
			current=current.next;
		}
		System.out.println();
	}
	
	/**
	 * 查找结点
	 */
	public DoubleNode find(Object value) {
		DoubleNode current =first;
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
		DoubleNode current =first;
		DoubleNode previous =first;
		while(current.data!=value) {
			if(current.data==null) {
				return false;
			}else {
				current =current.next;
			}
		}
		if(current==first) {
			first=current.next;
			size--;
		}else {
			current.previous.next=current.next;
			size--;
		}
		return true;
	}
	public boolean isEmpty() {
		if(size==0) {return true;}
		return false;
	}
}
