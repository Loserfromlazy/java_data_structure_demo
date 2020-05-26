package ch6;

/**
 * 快速排序
 */
public class QuickSort {
    /**
     * 划分数组
     * @param arr
     * @param left  起点位置
     * @param right 终点位置
     *
     */
    public static int partition(long arr[],int left,int right){
        int leftPtr = left;//关键字为arr[left],所以下面++leftPtr，及跳过关键字
        int rightPtr=right+1;//下面为--rightPtr，所以此处加1
        long point =arr[left];
        while(true){
            //循环，将比关键字小的留在左边
            while (leftPtr < right && arr[++leftPtr] < point);
            //循环，将比关键字大的留在右边
            while (rightPtr > 0 && arr[--rightPtr] > point);
            if (leftPtr>=rightPtr){//左右游标相遇时停止
                break;
            }else{//为相遇时交换元素
                swap(arr,leftPtr,rightPtr);
            }
        }
        //最后交换左右游标相遇时的所指的元素与关键字交换
        swap(arr,left,rightPtr);
        return rightPtr;//返回关键字位置
    }

    public static void sort(long arr[],int left,int right){
        //设置跳出条件
        if(left>=right){
            return;
        }else {

            int part=partition(arr,left,right);
            sort(arr,left,part-1);//对上一轮排序，关键字左边的子数组递归
            sort(arr,part+1,right);//对上一轮排序，关键字右边的子数组递归 ;
        }
    }
    /**
     * 显示数组
     * @param arr
     */
    public static void display(long [] arr){
        for (long x : arr) {
            System.out.print(x+"  ");
        }
        System.out.println();
    }

    /**
     * 交换
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(long [] arr,int i,int j){
        long tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
