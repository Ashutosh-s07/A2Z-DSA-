

public class LargestOddNumberinString {
    public static void main(String[] args) {
        String num = "52";
        // largestOddNumber(num);
        System.out.println(largestOddNumber(num));
    }
    static String largestOddNumber(String num) {
        // System.out.println(num.length());
        
        int n = num.length();
        for(int i=1;i<=num.length();i++){
            // System.out.println(num.charAt(n-i)); 
            // System.out.println(num.substring(0, n-i));
            if(num.charAt(n-i)=='1' || num.charAt(n-i)=='3' || num.charAt(n-i)=='5' || num.charAt(n-i)=='7' || num.charAt(n-i)=='9'){
                
                return num.substring(0, n-i+1);
            }
        }
        return "";
    }
}
