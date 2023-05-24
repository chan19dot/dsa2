public class BallFall {
    public static int[] findBall(int[][] grid) {
//        int[] result = new int[grid[0].length];
//        int position=0;
//        while(position<grid[0].length) {
//            int ballLeft=position;
//            for (int row = 0; row < grid.length; row++) {
//                int temp =grid[row][ballLeft];
//                ballLeft+= temp;
//                if(grid[row][ballLeft]== -1*temp){
//                    ballLeft =-1;
//                    break;
//                }
//            }
//            result[position]=ballLeft;
//            position++;
//
//        }
//
//        return result;
//        }
        int m = grid.length;
        int n = grid[0].length;

        final int[] result = new int[n];
        for (int i = 0; i < n; ++i) {
            int cy = 0;
            int cx = i;
            while(cy < m && !isBlocked(grid, cy, cx)) {
                cx += grid[cy][cx];
                cy += 1;
            }

            result[i] = cy == m ? cx : -1;
        }

        return result;
    }

    private static boolean isBlocked(
            int[][] grid,
            int cy,
            int cx
    ) {
        int n = grid[0].length;
        return (grid[cy][cx] == 1 && cx == n - 1)
                || (grid[cy][cx] == -1 && cx == 0)
                || (grid[cy][cx] == 1 && grid[cy][cx + 1] == -1)
                || (grid[cy][cx] == -1 && grid[cy][cx - 1] == 1);
    }



    public static void main(String[] args) {
        int[][] grid = new int[][]{{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
        int[] res = findBall(grid);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}
