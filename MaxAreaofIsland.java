public class MaxAreaofIsland {
    public static void main(String[] args) {
        int[][] grid = //{{1}};
                {{0,0,1,0,0,0,0,1,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,1,1,0,1,0,0,0,0,0,0,0,0},
                        {0,1,0,0,1,1,0,0,1,0,1,0,0},
                        {0,1,0,0,1,1,0,0,1,1,1,0,0},
                        {0,0,0,0,0,0,0,0,0,0,1,0,0},
                        {0,0,0,0,0,0,0,1,1,1,0,0,0},
                        {0,0,0,0,0,0,0,1,1,0,0,0,0}};

        System.out.println(maxAreaOfIsland(grid));
    }
    public static int maxAreaOfIsland(int[][] grid) {
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
//                consumeAll(i,j,grid);
//                maxCount = Integer.max(maxCount,count);
//                count =0;
                maxCount =Integer.max(maxCount,dfsMax(i,j,grid));
            }
        }
        return maxCount;
    }

    static int dfsMax(int i, int j,int[][] grid){
        int counter=0;
        if(isValid(i, j, grid)){
            grid[i][j] =0;
            counter++;
            int[] x = {-1,0,0,1};
            int[] y = {0,-1,1,0};
            for(int k= 0; k<x.length&& k<y.length ; k++){
                counter = counter + dfsMax(i+x[k], j+y[k], grid);
            }
        }
        return counter;
    }

    //Approach 2
    static int count =0;
    static void consumeAll(int i, int j,int[][] grid){
        if(isValid(i, j, grid)){
            grid[i][j] =0;
            count++;
            int[] x = {-1,0,0,1};
            int[] y = {0,-1,1,0};
            for(int k= 0; k<x.length&& k<y.length ; k++){
                consumeAll(i+x[k], j+y[k], grid);
            }
        }
    }
    static boolean isValid(int i, int j, int[][] grid){
        return i>=0 && j>=0 && i<grid.length && j<grid[i].length && grid[i][j] == 1;
    }
}
