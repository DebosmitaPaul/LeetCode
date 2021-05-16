import java.lang.reflect.Array;

public class Search_InsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;
        Search_InsertPosition obj = new Search_InsertPosition();
        System.out.println(obj.searchInsert(nums, target) );
    }
    public int searchInsert(int[] nums, int target) {
//        for(int i=0;i<nums.length; i++){
//            if(nums[i] == target){
//                return i;
//            }
//        }
        int j=0;
        while(j<nums.length && nums[j] <= target ){
            if(nums[j] == target){
                return j;
            }
            j++;
        }
        return j;
    }
}
