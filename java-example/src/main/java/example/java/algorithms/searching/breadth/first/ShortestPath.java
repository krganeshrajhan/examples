package example.java.algorithms.searching.breadth.first;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath {
    static int shortestCellPath(int[][] grid, int sr, int sc, int tr, int tc) {
        // your code goes here
        HashSet<String> visited = new HashSet<String>();
        Queue<String> queue = new LinkedList<String>();
        queue.add(sr+"-"+sc+":"+0);
        visited.add(sr+"-"+sc);
        while(!queue.isEmpty()) {
            String node = queue.poll();
            int r = Integer.parseInt(node.substring(0,node.indexOf("-")));
            int c = Integer.parseInt(node.substring(node.indexOf("-")+1,node.indexOf(":")));
            int count = Integer.parseInt(node.substring(node.indexOf(":")+1,node.length()));
            if(r==tr && c == tc)
                return count;
            calculatePathLength(grid, visited, queue, r-1, c, count);
            calculatePathLength(grid, visited, queue, r, c+1, count);
            calculatePathLength(grid, visited, queue, r+1, c, count);
            calculatePathLength(grid, visited, queue, r, c-1, count);
        }
        return -1;
    }

    public static void calculatePathLength(int[][] grid, HashSet<String> visited, Queue<String> queue, int r, int c, int count) {
        if(r >= 0 && r< grid.length && c>=0 && c<grid[0].length && !visited.contains(r+"-"+c) && grid[r][c]==1) {
            queue.add(r+"-"+c+":"+(count+1));
            visited.add(r+"-"+c);
        }
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 1, 1, 1}, {0, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(ShortestPath .shortestCellPath(grid, 0, 0, 2, 0));
	}
}
