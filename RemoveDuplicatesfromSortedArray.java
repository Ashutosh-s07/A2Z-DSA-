
public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    
    static int removeDuplicates(int[] nums) {
        int i=0,j=1,c=1;
        for(i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){ 
                nums[j]=nums[i+1];
                j++;c++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        return c;        
    }
}
