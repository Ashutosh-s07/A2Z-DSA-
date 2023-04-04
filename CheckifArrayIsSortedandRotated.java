import java.util.Arrays;

import javax.management.ImmutableDescriptor;

public class CheckifArrayIsSortedandRotated{
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(check(nums));
    }
    
    static boolean check(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        Arrays.sort(ans);
        int x=ans[0];
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==x) j=i;
        }
        System.out.println(j);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(nums));
        int[] result = RightRotate(ans, ans.length, j);
        if(Arrays.equals(nums, result)) return true;
        else return false;
    }
    static int[] RightRotate(int ans[],int n, int k){
        k=k%n;
        int[] ans1 = new int[ans.length];

        for(int i = 0; i < n; i++){
            if(i<k){
                ans1[i]=ans[n + i - k];
            }
            else{
                ans1[i]=ans[i - k];
            }
        }
        System.out.println(Arrays.toString(ans1));
        return ans1;
    }
}