public class RemoveElement {
    public static void main(String[] args) {
        int i =10;
        long j =i;
        float z =j;

        z = z+0.2f;
        i=(int)z;

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j =0;
        for (int i=0;i<n;i++){
            if(nums[i] != val ){
                nums[j]=nums[i];
                j++;
            }
        }
        return  j;
    }
}
