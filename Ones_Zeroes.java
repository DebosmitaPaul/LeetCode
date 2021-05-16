import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ones_Zeroes {
    static String[] strs = {"10","1","0"};//{"10","0001","111001", "1", "0"};
    static int m =1;//5; //0's
    static int n =1;// 3; //1's
    public static void main(String[] args) {
        System.out.println(findMaxForm());
    }
    static int findMaxForm(){
        Map<String, ArrayList<Integer>> data= new HashMap<String, ArrayList<Integer>>();
        for (String st : strs){
            char[] ch =st.toCharArray();
            Integer count0=0;
            Integer count1=0;
            for (char c : ch){
                if(c=='0'){
                    count0++;
                }
                else {
                    count1++;
                }
            }
            ArrayList<Integer> arrlist =new ArrayList<Integer>();
            if(count0<=m && count1<=n) {
                arrlist.add(count0);
                arrlist.add(count1);
                data.put(st, arrlist);
            }
        }
        return data.size();
    }
}
