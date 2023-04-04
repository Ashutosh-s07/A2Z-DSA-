import java.sql.PseudoColumnUsage;
import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aaa", magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    static boolean canConstruct(String ransomNote, String magazine) {
        int i=0,j=0,c=0;
        while(i<ransomNote.length() && j<magazine.length()){
            if(ransomNote.charAt(i++)==magazine.charAt(j++)){
                c++;
                if(c==ransomNote.length()) return true;
            }
        }
        return false;

    }
}
