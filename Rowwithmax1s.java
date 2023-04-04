
public class Rowwithmax1s {
    public static void main(String[] args) {
        int N = 2 , M = 2;
        int Arr[][] = {{0, 0, 0, 0},
           {0, 0, 0, 0},};
        System.out.println(rowWithMax1s(Arr,N,M));
    }
    static int rowWithMax1s(int arr[][], int n, int m) {
        int c=0;
        int m1=0;
        int[] nums = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            c=0;
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    c++;
                    m1=Math.max(m1, c);
                }
            }nums[i]=c;
        }
        // System.out.println(Arrays.toString(nums));
        if(m1==0) return -1;
        for(int i=0;i<n;i++){
            if(nums[i]==m1) return i;
        }
        return m1;
        
    }
}
