package ch6;

public class ShellSort {
	public static void sort(long[] arr) {
		// 初始化间隔
		int h = 1;
		// 计算最大间隔
		while (h < arr.length / 3) {
			h = h * 3 + 1;
		}
		while (h > 0) {
			// 进行插入排序
			for (int i = h; i < arr.length; i++) {// 从最大间隔开始进行排序
				long temp = arr[i];
				int j = i;
				while (j > h - 1 && temp <= arr[j - h]) {// 如果比同间隔小则交换两个数，比如a[4]<a[1];a[5]<a[2];a[6]<a[3]....
					arr[j] = arr[j - h];
					j -= h;
				}
				arr[j] = temp;
			}
			h = (h - 1) / 3;// 减小间隔
		}
	}
}
