import java.util.HashMap;

import org.xml.sax.HandlerBase;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(nums, k)); 
    }
    static int subarraySum(int[] nums, int k) {
        
        int sum=0;
        int count=0;

        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(0,1);
            sum+=nums[i];
            if(mp.containsKey(sum-k)){
                count+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
