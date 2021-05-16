public class Find_FirstLastElement_SortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] a = searchRange( nums, target);
        System.out.println(a[0]+","+ a[1]);
    }
    static int[] searchRange(int[] nums, int target) {
        int[] a ={-1,-1};
        if(nums.length<0){
            return a;
        }
        int count =0;
        for (int i=0; i<nums.length; i++){
            if(nums[i] == target ){
                count++;
                if(count == 1){
                    a[0]=i;
                    a[1] =i;
                }
                else{
                    a[1] = i;
                }
            }
        }
        return a;
    }
}
