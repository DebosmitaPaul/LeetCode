public class PrintLeaderArray {
    public static void main(String[] args) {
        PrintLeaderArray lead = new PrintLeaderArray();
        int arr[] = new int[]{16, 17, 18, 3, 5, 2};
        int n = arr.length;
        lead.printLeaders_n(arr, n);
        //lead.printLeaders_n2(arr, n);
    }

    private void printLeaders_n(int[] arr, int n) {
        int leader =arr[n-1] ;
        for (int i=n-2; i>=0;i--){
            if(leader <= arr[i]){
                leader = arr[i];
                System.out.println(leader);
            }
        }
    }

    private void printLeaders_n2(int[] arr, int n) {
        for (int i=0;i<n;i++){
            int j;
            for ( j =i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n) {
                System.out.println("result" + arr[i]);
            }
        }
    }
}
