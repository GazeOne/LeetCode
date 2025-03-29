package interview150;

public class Solution {

    public boolean solution(String[] B) {
        // Implement your solution here

        int n = B.length;
        int m = B[0].length();
        char[][] data = new char[n][m];

        int startI = 0;
        int startJ = 0;

        for (int i = 0; i < n; i++) {
            String temp = B[i];
            for (int j = 0; j < m; j++) {
                char cur = temp.charAt(j);
                if (cur == 'A') {
                    startI = i;
                    startJ = j;
                }
                data[i][j] = cur;
            }
        }


        boolean[][] visited = new boolean[n][m];

        while (checkIsVisited(visited, n, m)) {
            boolean isFound = checkAIsFound(data, startI, startJ, n, m);
            if (isFound) return false;

            int tempI = startI;
            int tempJ = startJ;
            while (tempI >=0 && tempI < n && tempJ >=0 && tempJ<m) {
                tempI--;
                if (tempI >=0 && tempI < n) {
                     isFound = checkAIsFound(data, tempI, tempJ, n, m);
                     visited[tempI][tempJ] = true;
                    if (isFound) return false;
                } else {
                    tempI++;
                    tempJ--;
                }
                tempJ--;
                if (tempJ >=0 && tempJ<m) {
                    isFound = checkAIsFound(data, tempI, tempJ, n, m);
                    visited[tempI][tempJ] = true;
                    if (isFound) return false;
                } else {
                    tempJ++;
                    tempI++;
                }
            }

        }

        return true;
    }

    private boolean checkIsVisited(boolean[][] visited, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j< m; j++) {
                if (!visited[i][j]) return false;
            }
        }
        return true;
    }
    private boolean checkAIsFound(char[][] data, int i, int j, int n, int m) {
        int temp = i;
        while (temp >= 0 && temp < m) {
            if (data[temp][j] == 'X') break;
            else if (data[temp][j] == '>') return true;
            else if (data[temp][j] == ' ') temp--;
        }
        temp = i;
        while (temp >= 0 && temp < m) {
            if (data[temp][j] == 'X') break;
            else if (data[temp][j] == '<') return true;
            else if (data[temp][j] == ' ') temp++;
        }
        temp = j;
        while (temp >= 0 && temp < n) {
            if (data[j][temp] == 'X') break;
            else if (data[j][temp] == '^') return true;
            else if (data[j][temp] == ' ') temp++;
        }
        temp = j;
        while (temp >= 0 && temp < n) {
            if (data[j][temp] == 'X') break;
            else if (data[j][temp] == 'v') return true;
            else if (data[j][temp] == ' ') temp--;
        }

        return false;
    }

}
