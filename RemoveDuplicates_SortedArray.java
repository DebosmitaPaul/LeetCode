import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates_SortedArray {

    public static Integer arr[] = new Integer[]{0,0,1,2,2,3,3,4,4,4};
    public static void main(String[] args) {
        RemoveDuplicates_SortedArray ob = new RemoveDuplicates_SortedArray();
        System.out.println(ob.removeDuplicate());
    }
    private int removeDuplicate(){
        int n = arr.length;
        int j=0;
        for(int i=1; i<n; i++){
            if(arr[j]!= arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }
}
