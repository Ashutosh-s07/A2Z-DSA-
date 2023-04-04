import java.util.Arrays;

public class LargestElementInanArray{
    public static void main(String[] args) {
        int[] arr = {1,5,9,7,2};
        System.out.println("Max Element is "+largestelelement(arr));
    }
    static int largestelelement(int[] arr){
        // Approach1 log(o*logn)
        Arrays.sort(arr);
        return arr[arr.length-1];

        // // approach2 log(n)
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        // return max;
    } 
}