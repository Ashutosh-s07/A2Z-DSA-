import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
        System.out.println(longestConsecutive(nums));
    }
    static int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
        }
        int c=0,maxi=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i]-1)){
                c=1;
                while(hs.contains(nums[i]+c)) c++;
                maxi=Math.max(maxi, c);
            }
        }
        return maxi;
    }
}
