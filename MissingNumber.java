public class MissingNumber{
    public static void main(String[] args) {
        int[] A = {6,1,2,8,3,4,7,10,5};
        int N=10;
        System.out.println(missingNumber(A,N));
    }
    static int missingNumber(int[] A, int N) {
                    int sum = (N*(N+1))/2;
                    for(int i:A){
                        sum-=i;
                    }
                    return sum;
    }
}