import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    List<String> ans = new ArrayList<>();
    int[][] movements = {{0, 1}, {0, -1},{1, 0},{-1, 0}};

    boolean isSafe(int x, int y, char[][] board) {
        int n = board.length;
        int m = board[0].length;
        return x >= 0 && y>= 0 && x < n && y < m && board[x][y] != '#';

    }
    void func(int x,int y, StringBuilder curr, char[][] board, HashSet<String> st) {
        if (curr.length() >= 10)
        return;
        if (!isSafe(x, y, board))
        return;
        curr.append(board[x][y]);
        if (st.contains(curr.toString())) {
            st.remove(curr.toString());
            ans.add(curr.toString());
        }
        curr.deleteCharAt(curr.length() - 1);
        char ch = board[x][y];
        for (int[] it : movements) {
            int nx = x + it[0];
            int ny = y + it[1];
            curr.append(board[x][y]);
            board[x][y] = '#';
            func(nx, ny, curr, board, st);
            curr.deleteCharAt(curr.length() - 1);
            board[x][y] = ch;
        }
    }
    public List<String> findWords(char[][] board, String[] words) {
        HashSet<String> st = new HashSet<>();
        for (String it : words)
             st.add(it);
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; ++i) {
            for(int j = 0; j <m; ++j) {
                StringBuilder curr = new StringBuilder();
                func(i, j, curr, board, st);
            }
        }
        return ans;
    }
}
