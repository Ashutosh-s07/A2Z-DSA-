import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[]  nums = {2,0,2,1,1,0};
        sortColors(nums);  
    }
    static void sortColors(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
