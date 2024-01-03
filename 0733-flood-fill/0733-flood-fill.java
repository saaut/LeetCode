import java.util.ArrayDeque;
import java.util.Queue;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) {
            return image;
        }

        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= 0 && newRow < image.length && newCol >= 0 && newCol < image[0].length) {
                    if (image[newRow][newCol] == oldColor) {
                        image[newRow][newCol] = newColor;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
        }

        return image;
    }
}
