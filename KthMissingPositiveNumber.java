import java.util.ArrayList;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr, k));

    }
    static int findKthPositive(int[] arr, int k) {
        for(int i:arr){
            if(i<k) k++;
            else break;
        }
        return k;
    }
}
