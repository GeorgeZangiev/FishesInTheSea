import java.util.Arrays;

public class FishesInTheSea {

    private int collectFish(int[][] fish, int x, int y, int n, int m, int[][] dp)
    {
        if ((x < 0) || (x == n) || (y == m)) {
            return 0;
        }

        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        int rightUpperDiagonal
                = collectFish(fish, x - 1, y + 1, n, m, dp);

        int right = collectFish(fish, x, y + 1, n, m, dp);

        int rightLowerDiagonal
                = collectFish(fish, x + 1, y + 1, n, m, dp);

        return fish[x][y] +
                Math.max(Math.max(rightUpperDiagonal, rightLowerDiagonal), right);
    }

    private int fishing(int[][] fish, int n, int m)
    {
        int maxFish = 0;
        int[][] dp = new int[n][m];
        for (int row = 0; row < n; row++) {
            Arrays.fill(dp[row], -1);
        }
        for (int i = 0; i < n; i++) {
            int fishCollected
                    = collectFish(fish, i, 0, n, m, dp);
            maxFish = Math.max(maxFish, fishCollected);
        }

        return maxFish;
    }

    public int solve(int[][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;
        return fishing(matrix, rows, columns);
    }
}

