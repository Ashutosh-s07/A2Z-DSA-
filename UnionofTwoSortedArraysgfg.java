import java.util.ArrayList;
import java.util.Arrays;

public class UnionofTwoSortedArraysgfg {
    public static void main(String[] args) {
      int n = 5, arr1[] = {2, 2, 3, 4, 5};  
      int m = 5, arr2[] = {1, 1, 2, 3, 4};

    //    System.out.println(Arrays.toString(findUnion(arr1, arr2, n, m)));
    findUnion(arr1, arr2, n, m); 
    }
    static void findUnion(int arr1[], int arr2[], int n, int m)
    {
        int[] arr3 = new int[n+m];
        int i = 0;  
        int j = 0;  
        int k = 0;  
          
        // traverse the arr1 and insert its element in arr3
        while(i < n){   
         arr3[k++] = arr1[i++];   
        }   
          
        // now traverse arr2 and insert in arr3
        while(j < m){   
         arr3[k++] = arr2[j++];   
        }
        Arrays.sort(arr3);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int x:arr3){
            i=0;
            if(!nums.contains(x)){
                nums.add(x);
            }
        }
        System.out.println((nums));
    }
}
