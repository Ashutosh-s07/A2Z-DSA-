import javax.lang.model.element.Element;

public class Squarerootofanumber {
    public static void main(String[] args) {
        long x = 5;
        System.out.println(florSqrt(x)); 
    }
    static long florSqrt(long x){
        
        long l=0;
        long h=x;
        while(l<=h){

            long mid = l+(h-l)/2;
            // mid+=1;
            if(mid*mid == x) return mid;
            else if(mid*mid>x) h=mid-1;
            else l=mid+1;
        } 
        return h;
    }

}
