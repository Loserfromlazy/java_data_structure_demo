package ch4;

/**
 * 单项列表的节点
 * @author Loserfromlazy
 *
 */
public class Node {
	//数据域
	public Object data;
	//节点域
	public Node next;
	
	public Node(Object value) {
		this.data=value;
	}
	
	/**
	 * 显示
	 */
	public void display() {
		System.out.print(data+" ");
	}
}
