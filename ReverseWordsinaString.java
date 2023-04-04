import java.util.Arrays;

public class ReverseWordsinaString {
    public static void main(String[] args) {
        String s = "the sky is blue";
        // reverseWords(s);
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        int d=0,c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                d++;
                if(c!=0){
                    stradd(s,n,c);
                }
            }
            else c++;
        }
        return s;
    }
    static String
}
