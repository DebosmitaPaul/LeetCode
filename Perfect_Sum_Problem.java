import java.util.ArrayList;

public class Perfect_Sum_Problem {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;
        int sum = 10;
        printAllSubsets(arr, n, sum);
    }
    static boolean[][] dp;

    static void display(ArrayList<Integer> v)
    {
        System.out.println(v);
    }
    static void printSubsetsRec(int arr[], int i, int sum, ArrayList<Integer> p)
    {
        if (i == 0 && sum != 0 && dp[0][sum])
        {
            p.add(arr[i]);
            display(p);
            p.clear();
            return;
        }

        if (i == 0 && sum == 0)
        {
            display(p);
            p.clear();
            return;
        }
        if (dp[i-1][sum])
        {
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(p);
            printSubsetsRec(arr, i-1, sum, b);
        }
        if (sum >= arr[i] && dp[i-1][sum-arr[i]])
        {
            p.add(arr[i]);
            printSubsetsRec(arr, i-1, sum-arr[i], p);
        }
    }
    static void printAllSubsets(int arr[], int n, int sum)
    {
        if (n == 0 || sum < 0)
            return;
        dp = new boolean[n][sum + 1];
        for (int i=0; i<n; ++i)
        {
            dp[i][0] = true;
        }
        if (arr[0] <= sum)
            dp[0][arr[0]] = true;
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < sum + 1; ++j)
                dp[i][j] = (arr[i] <= j) ? (dp[i-1][j] ||
                        dp[i-1][j-arr[i]])
                        : dp[i - 1][j];
        if (dp[n-1][sum] == false)
        {
            System.out.println("There are no subsets with" +
                    " sum "+ sum);
            return;
        }
        ArrayList<Integer> p = new ArrayList<>();
        printSubsetsRec(arr, n-1, sum, p);
    }
}
