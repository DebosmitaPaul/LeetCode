import java.util.HashMap;
import java.util.Map;

public class GetPairsCount {
    public static Integer[] arr = new Integer[] { 10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1 };
    public static void main(String[] args) {
        int sum = 11;
        int count = getPairsCount(arr.length,sum);
        System.out.println(count);
    }
    static int getPairsCount(int n, int sum) {
        Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (!dic.containsKey(arr[i])) {
                dic.put(arr[i], 0);
            }
            dic.put(arr[i], dic.get(arr[i]) + 1);
        }
        int twice_count = 0;
        for (int i = 0; i < n; i++) {
            if (dic.containsKey(sum - arr[i]) && dic.get(sum - arr[i]) != 0) {
                twice_count += dic.get(sum - arr[i]);
            }
            if (sum - arr[i] == arr[i]) {
                twice_count--;
            }
        }
        return twice_count / 2;
    }
}
