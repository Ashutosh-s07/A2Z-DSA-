import java.util.ArrayList;
import java.util.Arrays;

public class ReshapetheMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4}};
        int r = 2, c = 2;
        int[][] ans=matrixReshape(mat, r, c);
        for(int i=0;i<ans[0].length;i++){
            for(int j=0;j<ans.length;j++){
                System.out.print(ans[i][j]);
            }System.out.println();
        }
        // matrixReshape(mat, r, c);
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c) return mat;

        ArrayList<Integer> al = new ArrayList<>();
        int[][] reshapemat = new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                al.add(mat[i][j]);
            }
        }
        // System.out.print(al);
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                reshapemat[i][j]=al.get(k++);
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            System.out.print(reshapemat[i][j]+" ");
            }
            System.out.println();
        }
        return reshapemat;
    }
}