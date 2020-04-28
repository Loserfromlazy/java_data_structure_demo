package ch1;

public class TestMyArray {
		public static void main(String[] args) {
			MyArray arr=new MyArray();
			arr.insert(10);
			arr.insert(30);
			arr.insert(20);
			arr.insert(15);
			arr.insert(120);
			arr.display();
			System.out.println(arr.binarySearch(15));
		}
		
}
