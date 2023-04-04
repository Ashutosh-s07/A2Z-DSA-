import java.util.HashMap;
import java.util.*;
public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }
    static List<Integer> majorityElement(int[] arr) {
            HashMap<Integer,Integer> mp = new HashMap<>();
            List<Integer> al = new ArrayList<Integer>();

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
                if(entry.getValue() > arr.length/3) al.add(entry.getKey()); 
            }
            return al;
        }
}
