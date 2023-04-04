import java.util.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums ={0,2};
        System.out.println(maxProduct(nums));
    }
    static int maxProduct(int[] nums) {
        int maxi=0;
        if(nums.length==1) return nums[0];
        int p=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                p=1;
                for(int k=i;k<j+1;k++){
                    System.out.print(nums[k]+" ");
                    p*=nums[k];
                    maxi=Math.max(maxi,p);
                }
                System.out.println();
            }
        }
        return maxi;
    }    
    static int product(int[] nums, int i, int j){
        int p=1;
        for( i=0;i<j;i++){
            p*=nums[i];
        }
        System.out.println("product  : "+p);
        return p;
    }
}
