public class FloorinaSortedArray{
    public static void main(String[] args) {
        int N = 7, x = 0; 
        long [] arr = {1,2,8,10,11,12,19};
        System.out.println(findFloor( arr,N, x));
    }
    static int findFloor(long arr[], int n, long x)
    {
        if(x<arr[0]) return -1;
        int s=0,e=n-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m]==x) return m;
            else if(arr[m]<x) s=m+1;
            else e=m-1;
        }
        return s;
    }
} 