public class Largest2ndElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {6,6,6,6,6,6};
        int n = 6;

        System.out.println(print2largest(arr,n));
        secondSmallest(arr, n);
        
    }

    static int print2largest(int[] arr, int n){
        
        //complexity O(n) double pass

        // int largest = Integer.MIN_VALUE;
        // int seclargest = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     largest = Math.max(arr[i],largest);
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[i]>seclargest && arr[i]!=largest){
        //         seclargest = arr[i];
        //     }
        // }
        // return seclargest;
    
        
        //complexity O(n) single pass
    {
	if(n<2)
	return -1;
    int large=Integer.MIN_VALUE,second_large=Integer.MIN_VALUE;
    int i;
    for (i = 0; i < n; i++) 
    {
        if (arr[i] > large) 
        {
            second_large = large;
            large = arr[i];
        }
 
        else if (arr[i] > second_large && arr[i] != large) 
        {
            second_large = arr[i];
        }
    }
    // System.out.println(large);
    // System.out.println(second_large);
    if(second_large == Integer.MIN_VALUE) return -1;
    return second_large;  
}

    }
    static private int secondSmallest(int[] arr, int n)
{
	if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
}
}
