import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Concatenate_Char {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = 0;
        String s = br.readLine();
        //N = Integer.parseInt(s.trim());
        String[] arr_ch  = s.split(" ");

        char[] ch = new char[]{'D', 'B','O'};
        for(int i_ch = 0; i_ch < arr_ch.length; i_ch++)
        {
           // ch[i_ch] = arr_ch[i_ch].charAt(0);
        }

        String out_ = solve( ch);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static String solve( char[] ch){
        // Write your code here
        String result = "";
        for (char c:ch ) {
            //result.(Character.toString(c));
        }
        return result;

    }
}
