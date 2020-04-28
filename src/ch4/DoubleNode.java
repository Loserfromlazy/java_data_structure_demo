package ch4;

/**
 * 双向列表的节点
 * @author Loserfromlazy
 *
 */
public class DoubleNode {
	//数据域
	public Object data;
	//节点域
	public DoubleNode next;
	//向前的指针
	public DoubleNode previous;
	
	public DoubleNode(Object value) {
		this.data=value;
	}
	
	/**
	 * 显示
	 */
	public void display() {
		System.out.print(data+" ");
	}
}
