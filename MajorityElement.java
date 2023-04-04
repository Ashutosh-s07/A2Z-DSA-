import java.util.HashMap;
import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        // majorityElement(nums);
        System.out.println(majorityElement(nums));
    }
    static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            if(entry.getValue() > arr.length/2) return entry.getKey();
        }
        return 0;
    }
}
