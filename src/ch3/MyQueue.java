package ch3;
/**
 * java模拟队列
 * 已经修改为循环队列
 */
public class MyQueue {
	//底层使用数组
	private long arr[];
	//有效数据
	private int elements;
	//队头
	private int front;
	//队尾
	private int end;
	public MyQueue() {
		arr =new long [10];
		elements=0;
		front=0;
		end=-1;
	}
	public MyQueue(int maxsize) {
		arr =new long [maxsize];
		elements=0;
		front=0;
		end=-1;
	}
	
	/**
	 * 添加数据，队尾插入
	 */
	public void insert(long value) {
		if(end==arr.length -1) {//如果数据满了。就从头开始
			end=-1;
		}
		
		arr[++end]=value;
		elements++;
	}
	/**
	 * 删除数据
	 */
	public long remove() {
		long value =arr[front++];
		/*ps：这里是假清除，此处只是将要删除的数据返回将有效数据但未清除
        若想真正清除可以将long数组改为Object然后用如下方式
        Object value=null;
        value =arr[front];
        arr[front] = null;
        front++
        */
		if(front == arr.length) {
			front=0;
		}
		elements--;
		return value;
	}
	/**
	 * 查看数据，从队头查看
	 */
	public long peek() {
		return arr[front];
	}
	/**
	 * 判断是否为空
	 */
	public boolean isEmpty() {
		return elements==0;
	}
	public boolean isFull() {
		return elements ==arr.length;
	}
}
