
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1,0,4,0};
        moveZeroes(nums);
    }
    static void moveZeroes(int[] arr) {

        // Time complexity: o(n)   Space complexity: o(n)
        // int j=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0) nums[j++]=nums[i];
        // }
        // for(int i=j+1;j<nums.length;j++){
        //     nums[j]=0;
        // }

        // Time complexity: O(n)  Space complexity: O(1)
       int k = 0;
       while (k < arr.length) {
       if (arr[k] == 0) {

        break;
      } else {
        k = k + 1;
      }
    }

    //finding zeros and immediate non-zero elements and swapping them
    int i = k, j = k + 1;

    while (i < arr.length && j < arr.length) {
      if (arr[j] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;

      }

      j++;

    }
    for (i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
