import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray189 {
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotate(nums,k);
    }
    static void rotate(int[] nums, int k) {
         int[] a=new int[nums.length];
       for(int i=0;i<nums.length;i++){
           a[(i+k) % nums.length]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
           nums[i]=a[i];
       }
       System.out.println(Arrays.toString(nums));
    }
}
