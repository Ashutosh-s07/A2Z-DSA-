public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums  = {5, 1, 2, 3, 4};
        int n=nums.length;
        System.out.println(findMin(nums,n));

    }
    static int findMin(int[] arr, int n) {

           
        int start = 0;
        int end = n-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            int prev = (mid - 1  + n) % n;
            int next = (mid + 1) % n;
            
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next]){
                return arr[mid];
            }else if(arr[mid] <= arr[end]){
                end = mid - 1;
            }else if(arr[start] <= arr[mid]){
                start = mid + 1;
            }
        }
        return 0;
    }
}
