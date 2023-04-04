import javax.lang.model.element.Element;

public class Numberofoccurrence{
    public static void main(String[] args) {
        int N = 7, X = 2;
        int Arr[] = {1, 1, 2, 2, 2, 2, 3};
        System.out.println(count(Arr, N, X));

    }
    static int binary(int[] arr, int n, int x){
        int s=0, e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;

            if(arr[m]==x) return m;
            else if(arr[m]<x) s=m+1;
            else e=m-1;

        }
        return -1;
    }

    static int count(int[] arr, int n, int x) {
        int idx=binary(arr,n,x);
        
        if(idx==-1) return 0;
        int k=1;
        
        int left = idx-1;
        while(left>=0 && arr[left]==x){
            k++;
            left--;
        }

        int right = idx+1;
        while(right<n && arr[right]==x){
            k++;
            right++;
        }

        return k;
    }
    
}