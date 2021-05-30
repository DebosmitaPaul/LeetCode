import java.util.*;

public class SubSets {
    public static void main(String[] args) {
        String str = "deabasmita";
        System.out.println("Max occurring character is " +  getMaxOccuringChar(str));
        
//        int[] nums = {1,2,3};
//
//        System.out.println(subsets(nums));
    }

    private static  char getMaxOccuringChar(String str) {
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt((i)),1);
            } else{
                int val  = map.get(str.charAt(i));
                val++;
                map.put(str.charAt(i), val);
            }
        }
        int max =-1;
        int min =100;
        char res = ' ';
        char minres = ' ';
        for (int i = 0; i < str.length(); i++) {
             if(max< map.get(str.charAt(i))){
                 max = map.get(str.charAt(i));
                 res = str.charAt(i);
             }
             if(min> map.get(str.charAt(i))){
                 min = map.get(str.charAt(i));
                 minres = str.charAt(i);
             }
        }
        System.out.println("max "+ max);
        System.out.println("min "+ min);
        System.out.println("minres "+ minres);

        return res;
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0){
            return result;
        }
        List<Integer> subset = new ArrayList<>();
        findSubsets(nums,result,subset, 0);
        return result;
    }

    private static void findSubsets(int[] nums, List<List<Integer>> result, List<Integer> subset, int startIndex) {
        result.add(new ArrayList<>(subset));
        System.out.println("result" + result);
        for (int i = startIndex; i <nums.length ; i++) {
            subset.add(nums[i]);
            System.out.println("subset " + subset );
            findSubsets(nums,result,subset,i+1);
            subset.remove(subset.size()-1);
           // System.out.println("subset after removed " + subset );
        }

    }
}
