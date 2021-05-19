/*

Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
Ouptut: Sum found between indexes 2 and 4
Sum of elements between indices
2 and 4 is 20 + 3 + 10 = 33

 */

import java.util.HashMap;
import java.util.Map;

public class SubArray_Sum {
    public static void main(String[] args) {
        Integer[] arr ={ 3,2,3 }; //{ 15, 2, 4, 8, 9, 5, 10, 23 };
        int sum = 6;
        int x = subarraySum_Best(arr,sum);
        if(x==0){
            System.out.println("not found");
        }
    }

    private static int subarraySum_Best(Integer[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!m.containsKey(target - nums[i])){
                m.put(nums[i],i);
            } else {
                System.out.println(m.get(target - nums[i])+" to "+ i);
                return 1;
            }
        }
        return 0;
    }
}
