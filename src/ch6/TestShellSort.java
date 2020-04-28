package ch6;

public class TestShellSort {
	
	public static void main(String[] args) {
		long [] arr =new long[10];
		arr[0]=95;
		arr[1]=67;
		arr[2]=83;
		arr[3]=4;
		arr[4]=-4;
		arr[5]=76;
		arr[6]=22;
		arr[7]=55;
		arr[8]=32;
		arr[9]=-9;
		for (long l : arr) {
			System.out.print(l+"  ");
		}
		ShellSort.sort(arr);
		System.out.println();
		for (long x : arr) {
			System.out.print(x+"  ");
		}
	}
}
