public class Search_RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchInArray(nums,target));
    }

    private static int searchInArray(int[] nums, int target) {
        int n = nums.length;
        for (int i=0; i<n; i++){
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
}
