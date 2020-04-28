package ch5;

/**
 * 整数划分
 */
public class Huafen {

        public static void main(String[] args) {
            System.out.println(split(6));
        }
        public static int split(int n) {
            return p(n,n);
        }
        public static int p(int n,int m) {
            if(n==1 || m==1) {
                return 1;
            } else if(n<m) {
                return p(n,n);
            } else if(n==m) {
                return p(n,n-1)+1;
            } else if(n>m) {
                return  p(n,m-1) + p(n-m,m);
            }
            return -1;
        }
}
