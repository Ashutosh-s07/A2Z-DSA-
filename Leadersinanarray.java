import java.util.ArrayList;
import java.util.Arrays;

public class Leadersinanarray {
    public static void main(String[] args) {
        int n = 7;
        int A[] = {63, 70, 80, 80, 33, 33, 47, 20};
        // System.out.println(Arrays.toString(leaders(A, n)));
        System.out.println(leaders(A, n));
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>=maxi){
                maxi=arr[i];
                al.add(maxi);
            } 
        }
        System.out.println(al);
        int p=al.size();
        for(int i=0;i<p;i++){
            ans.add(al.get((p-1)-i));
        }
        return ans;
    }
}
