// https://www.codingninjas.com/codestudio/problems/subarrays-with-xor-k_6826258?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTab=1

import java.util.HashMap;

public class SubsetswithXORvalue {
    public static void main(String[] args) {
        int[] arr={5, 6, 7, 8, 9};
        int N = 5, k = 5;
        System.out.println(subsetXOR(arr, N, k));
    }

    static int subsetXOR(int arr[], int n, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int count = 0, xor = 0;
        for (int i = 0; i < n; i++) {  xor ^= arr[i];
        if (mp.containsKey(xor ^ k))  count += mp.get(xor ^ k);
        if (!mp.containsKey(xor))     mp.put(xor, 0);
        mp.put(xor,mp.get(xor) + 1);
        }
        return (count);
    }
}
