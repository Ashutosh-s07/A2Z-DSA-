import java.io.*;

public class NthRootofaNumberusingBinarySearch {
    public static void main(String[] args) {
        int n = 6, m = 4096;
        System.out.println(NthRoot(n, m));
    }
    static int NthRoot(int n, int m){

       int start = 0;
        int end = m;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            if(Math.pow(mid,n) == m) return mid;
            // if(multiply(mid,n) == m) return mid;
            else if(Math.pow(mid,n) > m) end = mid-1;
            // else if(multiply(mid,n) > m) end = mid-1;
            else start = mid+1;
         }
         return -1;
    }
}
