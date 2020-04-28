package ch1;
/**
 * 自定义类封装数组
 * 已经修改为有序数组
 */
public class MyArray {
		
	    private long [] arr;
	    //表示数组的有效数据的长度
	    private int elements;
	    public MyArray(){
	        arr =new long [50];
	    }
	    public MyArray(int maxsize){
	        arr =new long[maxsize];
	    }
	    /**
	     * 添加数据
	     */
	    public void insert(long value){
	        int i;
	        for(i=0;i<elements;i++){
	            if(arr[i]>value){
	                break;
	            }
	        }
	        for(int j=elements;j>i;j--){
	            arr[j]=arr[j-1];
	        }
	        arr[i]=value;
	        elements++;
	    }
	    /**
	     * 显示数据
	     */
	    public void display(){
	        System.out.print("[");
	        for(int i=0;i<elements;i++){
	            System.out.print(arr[i]+"  ");
	        }
	        System.out.println("]");
	    }
	    /**
	     * 根据值查找数据
	     */
	    public int search(long value){
	        int i;
	        for(i=0;i<elements;i++){
	            if(value==arr[i]){
	                break;
	            }
	        }
	        if(i==elements){
	            return -1;
	        }else{
	            return i;
	        }
	    }
	    /**
	     * 根据索引查找数据
	     */
	    public long get(int index){
	        if(index>=elements ||index <0){
	            throw new ArrayIndexOutOfBoundsException();
	        }else{
	            return arr[index];
	        }
	    }
	    /**
	     * 删除数据
	     */
	    public void delete(int index){
	        if(index>=elements ||index <0){
	            throw new ArrayIndexOutOfBoundsException();
	        }else{
	           for(int i=0;i<elements;i++){
	               arr[index]=arr[index+1];
	           }
	            elements--;
	        }
	    }
	    /**
	     * 更新数据
	     */
	    public void update(int index,long newvalue){
	        if(index>=elements ||index <0){
	            throw new ArrayIndexOutOfBoundsException();
	        }else{
	           for(int i=0;i<elements;i++){
	               arr[index]=newvalue;
	           }
	        }
	    }
	    
	    public int binarySearch(long value){
	        int middle=0;
	        int low=0;
	        int pow=elements;
	        while(true){
	            middle=(pow+low)/2;
	            if(arr[middle]==value){
	                return middle;
	            }else if(low >pow){
	                return -1;
	            }else{
	                if(arr[middle]>value){
	                    pow=middle-1;
	                }else{
	                    low=middle+1;
	                }
	            }
	        }
	    }
}
