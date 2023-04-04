public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    static int findMaxConsecutiveOnes(int[] nums) {
        // int c=0;
        // int m1 = 0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==1) {
        //         c++;
        //         System.out.println("at i: "+i+" c :"+c);
        //         m1=Math.max(m1,c);
        //     }
        //     else if(nums[i]==0){
        //         c=0;
        //         // m1=Math.max(m1,c);
        //     }
        // }
        // return m1;

        int i = 0;
        int f = 0; 
        for(int j=0; j<nums.length; j++){    
            if(nums[j]==1){
                i++;    
            }else{
                if(f < i){
                    f = i;
                }
                i = 0;
            }
        }
        if(f>i)return f;
        else return i; 
    }
}
