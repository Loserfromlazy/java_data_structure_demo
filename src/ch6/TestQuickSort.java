package ch6;

public class TestQuickSort {
    public static void main(String[] args) {
        //赋初值
        long [] arr=new long[10];
        for (int i = 0; i <10 ; i++) {
            arr[i]=(long)(Math.random()*99);
        }

        QuickSort.display(arr);

        QuickSort.partition(arr,0,arr.length-1);
        QuickSort.display(arr);
        QuickSort.sort(arr,0,arr.length-1);
        QuickSort.display(arr);
    }
}
