public class MedianinarowwisesortedMatrix {
    public static void main(String[] args) {
        int r=3, c=3;
        int mat[][] ={{1, 3, 5}, {2, 6, 9}, {3, 6, 9}};
        System.out.println(median(mat, r, c));
    }
    static int median(int mat[][], int r, int c){
        int l=1;
        int h =2000;
        while(l<=h){
            int mid = l+(h-l)/2;
            int elementCountLTEqmid = 0;
            for(int i=0;i<r;i++) elementCountLTEqmid+=getElementCountLTEqMid(mat[i],mid);
                if(elementCountLTEqmid<=((r*c)/2)) l=mid+1;
                else h=mid-1;
        }
        return l;   
    }

    static int getElementCountLTEqMid(int mat[], int pivot) {
        
        int l=0;
        int h=mat.length-1;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(mat[mid]<=pivot) l=mid+1;
            else h=mid-1;
        }
        return l;
    }

}
