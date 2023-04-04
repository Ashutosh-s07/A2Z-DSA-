public class Rotation {
    public static void main(String[] args) {
        int N = 5;
        int Arr[] = {5, 1, 2, 3, 4};
        System.out.println(findKRotation(Arr, N));
    }
    static int findKRotation(int arr[], int n) {
         
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int prev = (mid - 1  + n) % n;
            int next = (mid + 1) % n;
            
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return mid;
            }else if(arr[mid] <= arr[end]){
                end = mid - 1;
            }else if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
        }
        
        return 0;
    }
}
