import java.util.Arrays;

public class KthelementoftwosortedArrays {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9}; 
        int arr2[] = {1, 4, 8, 10};
        int k = 5;
        int n= arr1.length;
        int m = arr2.length;
        System.out.println(kthElement(arr1, arr2, n, m, k));
    }
    static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int s=0,e=0;
        int p=0;
        int[] ans = new int[n+m];

        while(s<n && e<m){
            if(arr1[s]<arr2[e]) ans[p++]=arr1[s++];
            else ans[p++]=arr2[e++];
        }
        if(s<n){
            while(s<n){
                ans[p++]=arr1[s++];
            }
        }
        if(e<m){
            while(e<m){
                ans[p++]=arr2[e++];
            }
        }
        return ans[k-1];
    }
}
