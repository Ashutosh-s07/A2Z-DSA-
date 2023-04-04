
import java.util.HashMap;

public class FirstUniqueCharacterinaString {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s)); 
    }
    static int firstUniqChar(String str) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }else{
                mp.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(mp.get(str.charAt(i))==1){
                return i;
            }
        }
        return -1;



         // Stores lowest index / first index
        // int ans = Integer.MAX_VALUE;
        // Iterate from a to z which is 26 which makes it constant
        // for(char c='a'; c<='z';c++){
            // indexOf will return first index of alphabet and lastIndexOf will return last index
            // if both are equal then it has occured only once.
            // through this we will get all index's which are occured once
            // but our answer is lowest index
        //     int index = s.indexOf(c);
        //     if(index!=-1&&index==s.lastIndexOf(c)){
        //         ans = Math.min(ans,index);
        //     }
        // }

        // If ans remain's Integer.MAX_VALUE then their is no unique character
        // return ans==Integer.MAX_VALUE?-1:ans;
    }
}
