// https://www.codingninjas.com/codestudio/problems/subarrays-with-xor-k_6826258?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTab=1

import java.util.HashMap;

public class SubsetswithXORvalue {
    public static void main(String[] args) {
        int[] arr={5, 6, 7, 8, 9};
        int N = 5, k = 5;
        System.out.println(subsetXOR(arr, N, k));
    }

    static int subsetXOR(int arr[], int n, int m) {
        HashMap<Integer, Integer> HashTable = new HashMap<>();
        HashTable.put(0, 1);
        int count = 0, curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum ^= arr[i];
        if (HashTable.containsKey(curSum ^ m))
            count += HashTable.get(curSum ^ m);
        if (!HashTable.containsKey(curSum))
            HashTable.put(curSum, 0);
            HashTable.put(curSum,HashTable.get(curSum) + 1);
        }
        return (count);
    }
}
