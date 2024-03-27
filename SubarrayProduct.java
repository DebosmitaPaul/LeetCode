import java.util.*;

public class SubarrayProduct {
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        int x = numSubarrayProductLessThanK(nums,k);
        System.out.println(x);
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        List<ArrayList<Integer>> res = new ArrayList<>();
        subArray(nums,0,res,new ArrayList<Integer>());
        int count=0;
        for(List list: res){
            int multiple=1;
            for(Object i : list){
                multiple = multiple * (int)i;// multiple * list.get(i);
            }
            if(list.size()>0 && multiple<k){
                System.out.println(list);
                count++;
            }
        }
        return count;
    }
    static void subArray(int[] nums,int index,List<ArrayList<Integer>> res,List<Integer> des){
        res.add(new ArrayList<>(des));
        for(int i=index; i<nums.length;i++){
            des.add(nums[i]);
            subArray(nums,i+1,res,des);
            des.remove(des.size()-1);
        }
    }
}
