import java.util.Arrays;

public class MergeSortedArray{
    public static void main(String[] args) {
       int[] nums1 = {1,2,3,0,0,0};
       int m = 3; 
       int[] nums2 = {2,5,6};
       int n = 3;
       merge(nums1, m, nums2, n);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
      int x=m-1,y=n-1,k=0;
      for(int i=0;i<nums2.length;i++){
         nums1[m++]=nums2[i];
      }
      Arrays.sort(nums1);
      System.out.println(Arrays.toString(nums1));
    }
}