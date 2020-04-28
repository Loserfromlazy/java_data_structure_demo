package ch3;

public class TestMyQuene {
	 public static void main(String[] args) {
	        MyQueue queue = new MyQueue(3);
	        queue.insert(1);
	        queue.insert(2);
	        queue.insert(3);//queArray数组数据为[1,2,3]
	         while(!queue.isEmpty()) {
	        	 System.out.print(queue.remove()+" ");
	         }
	         System.out.println();
	         queue.insert(1);
		     queue.insert(2);
		     queue.insert(3);//queArray数组数据为[1,2,3]
		     queue.insert(5);
		     queue.insert(6);
		     while(!queue.isEmpty()) {
		        System.out.print(queue.remove()+" ");
		     }
	    }
}
