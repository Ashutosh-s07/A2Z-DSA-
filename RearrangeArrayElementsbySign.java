import java.util.Arrays;

public class RearrangeArrayElementsbySign {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums))); 
    }
    static int[] rearrangeArray(int[] nums) {
        int o=1,e=0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) {
                ans[o]=nums[i];
                o+=2;
            }
            else{
                ans[e]=nums[i];
                e+=2;
            }
        }
        return ans;
    }
}
