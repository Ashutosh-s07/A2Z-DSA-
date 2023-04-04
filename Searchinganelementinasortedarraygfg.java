public class Searchinganelementinasortedarraygfg {
    public static void main(String[] args) {
        int N = 5, K = 6;
        int[] arr = {1,2,3,4,6};
        System.out.println(searchInSorted(arr, N, K));
    }
    static int searchInSorted(int arr[], int N, int K)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==K) return i;
        }
        return -1;
    }
}
