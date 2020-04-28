package ch2;

public class TestSort {
	public static void main(String[] args) {
		long [] arr=new long[5];
		arr[0]=95;
		arr[1]=-9;
		arr[2]=68;
		arr[3]=75;
		arr[4]=3;
		
		for (long l : arr) {
			System.out.print(l+" ");
		}
		System.out.println();
		System.out.println("插入排序");
		InsertSort.sort(arr);
		for (long l : arr) {
			System.out.print(l+" ");
		}
		/*System.out.println();
		System.out.println("选择排序");
		selectSort.sort(arr);
		for (long l : arr) {
			System.out.print(l+" ");
		}*/
	}
}
