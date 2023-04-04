import java.util.ArrayList;

public class GFGMaxsuminsubarrays {
    public static void main(String[] args) {
        long arr[] = {4, 3, 1, 5, 6};
        System.out.println(pairWithMaxSum(arr));
    }
    static long pairWithMaxSum(long arr[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        dffbbc
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                long mini = Integer.MAX_VALUE;
                long mini2=0;
                for(int k=i;k<j+1;k++){
                    mini=Math.min(mini, arr[k]);
                    
                    // System.out.print(arr[k]+" ");
                }
                // System.out.println();
                System.out.println(" mini1 : "+mini+" mini2 : "+mini2);
            }
        }
        return 0;
    }
}
/*
4 3 
4 3 1
4 3 1 5
4 3 1 5 6
3 1
3 1 5
3 1 5 6
1 5
1 5 6
5 6
 */