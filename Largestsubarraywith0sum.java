import java.util.HashSet;

public class Largestsubarraywith0sum {
    public static void main(String[] args) {
        int N = 8;
        int A[] = {15,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(A, N));
    }
    static int maxLen(int arr[], int n)
    {
        HashSet<Integer> h = new HashSet<>();
        int presum=0;
        for (int i = 0; i < arr.length; i++) {
            presum+=arr[i];
            // System.out.println(h);
            if(h.contains(presum)){
                return h.size();
            }
            if(presum==0) return h.size();
            h.add(presum);
        }
        return 0;
    }
}
