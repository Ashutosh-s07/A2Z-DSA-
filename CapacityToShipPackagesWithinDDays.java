public class CapacityToShipPackagesWithinDDays{
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(shipWithinDays(weights, days));
    }

    static int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=0,ans=1;
        for(int i:weights){
            if(i>max) max=i;
            sum+=i;
        }
        int low = max;
        int high = sum;
        while(low<=high){
            int mid  = low+(high-low)/2;
            if(CountDays(weights,mid,days)){
                ans=mid;
                high=mid-1;   
            }
            else low=mid+1;
        }
        return ans;
    }

    static boolean CountDays(int[] weights, int mid, int days){
        int d=1;
        int sumw=0;
        int count=0;
        for(int s:weights){
            if(sumw+s<=mid) sumw+=s;
            else {
                sumw=s;
                d++;
            }
        }
        return (d<=days);
        // else return false;
    }
}