import java.util.*;
public class SingleNumber {
    public static void main(String[] args) {
        int[] nums={4,4,2};
        System.out.println(singleNumber(nums));
    }
    static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
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
            if(entry.getValue() == 1) return entry.getKey();
        }
        return 0;
    }
}
