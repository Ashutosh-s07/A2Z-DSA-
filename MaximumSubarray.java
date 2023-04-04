public class MaximumSubarray{
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }
    static int maxSubArray(int[] nums) {

        //  Time Complexity: O(N^2) Space Complexity: O(1)
      
        // int sum=0;
        // int maxi = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         maxi = Math.max(maxi, sum);
        //     }
        // }
        // if(nums.length==1) return nums[0];
        // else return maxi;
        //========================================================

        int sum = 0;
        int maxi = nums[0];
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i=0;i<nums.length;i++){
            if(sum==0) start =i;
            sum+=nums[i];
            if(sum > maxi) {
                maxi=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0) sum=0;
        }
        System.out.println(ansStart+" "+ansEnd);
        return maxi;

    }
}