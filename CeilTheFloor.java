import java.util.Arrays;

public class CeilTheFloor {
    public static void main(String[] args) {
        int n = 8, X = 7;
        int Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
    }
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        Arrays.sort(arr);
        int floor=-1, ceil=-1;
        Pair pair = new Pair(-1,-1);
        int high = n-1, low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                pair.floor=arr[mid];
                pair.ceil=arr[mid];
                break;
            }
            else if(arr[mid]<x){
                pair.floor=arr[mid];
                low=mid+1;
            }
            else{
                pair.ceil=arr[mid];
                high=mid-1;
            }
        }
        return pair;
    }
}
