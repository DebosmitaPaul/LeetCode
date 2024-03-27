import java.util.*;

public class ContiguousSubarrayProduct {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        int x = numSubarrayProductLessThanK(nums,k);
        System.out.println(x);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int l = 0;
        int count =0;
        int product =1;
        for(int r=0;r<nums.length;r++){
            product = product * nums[r];
            while(product >= k){
                product=product/nums[l];
                l++;
            }
            count=count+(r-l+1);
        }
        return count;
    }
}
