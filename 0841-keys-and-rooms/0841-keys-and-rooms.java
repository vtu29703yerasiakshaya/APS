import java.util.List;
import java.util.Stack;
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0] = true;
        int visitedCount = 1;
        while (!stack.isEmpty()) {
            int currentRoom = stack.pop();
            for (int key : rooms.get(currentRoom)) {
                if (!visited[key]) {
                    visited[key] = true;
                    visitedCount++;
                    if (visitedCount == n) {
                        return true;
                    }
                    stack.push(key);
                }
            }
        }
        return visitedCount == n;
    }
}
