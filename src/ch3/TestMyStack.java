package ch3;

public class TestMyStack {
	public static void main(String[] args) {
		
		MyStack ms =new MyStack(4);
		ms.push(11);
		ms.push(5);
		ms.push(3);
		ms.push(24);
		
		System.out.println(ms.isEmpty());
		System.out.println(ms.isFull());
		System.out.println(ms.peek());
		while(!ms.isEmpty()) {
			System.out.print(ms.pop()+"  ");
		}
		
	}
}
