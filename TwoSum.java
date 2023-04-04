import java.util.Arrays;
import java.util.HashMap;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};

        int target = -8;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])) return new int[]{mp.get(target-nums[i]),i};
            else mp.put(nums[i],i );
        }
        return new int[]{-1,-1};
    }
}