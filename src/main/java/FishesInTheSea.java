public class FishesInTheSea {

    private int collectFish(int[][] fish, int x, int y, int n, int m)
    {
        if ((x < 0) || (x == n) || (y == m)) {
            return 0;
        }

        int rightUpperDiagonal
                = collectFish(fish, x - 1, y + 1, n, m);

        int right = collectFish(fish, x, y + 1, n, m);

        int rightLowerDiagonal
                = collectFish(fish, x + 1, y + 1, n, m);

        return fish[x][y] +
                Math.max(Math.max(rightUpperDiagonal, rightLowerDiagonal), right);
    }

    private int fishing(int[][] fish, int n, int m)
    {
        int maxFish = 0;
        for (int i = 0; i < n; i++) {
            int fishCollected
                    = collectFish(fish, i, 0, n, m);
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

