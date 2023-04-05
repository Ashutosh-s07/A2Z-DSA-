import java.rmi.server.ServerNotActiveException;
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        // System.out.println(generate(numRows));
        generate(numRows);
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; ++i) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; ++j)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
        for(List<Integer> i : res){
            System.out.println(i);
        }
		return res;
    }
    
}
