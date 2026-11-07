class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
       int qLen = queries.length;
       int[][] sortedQueries = new int[qLen][2];
       for (int i = 0; i < qLen; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
       }
       Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));
       Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
       int[] result = new int[qLen];
       int[] serverCounts = new int[n + 1];
       int activeServers = 0;
       int left = 0;
       int right = 0;
       for (int[] q : sortedQueries) {
        int endTime = q[0];
        int startTime = endTime - x;
        while (right < logs.length && logs[right][1] <= endTime) {
            int serverId = logs[right][0];
            if (serverCounts[serverId] == 0) {
                activeServers++; 
            }
            serverCounts[serverId]++;
            right++;
        }

        while (left < logs.length && logs[left][1] < startTime) {
            int serverId = logs[left][0];
            serverCounts[serverId]--;
            if (serverCounts[serverId] == 0) {
                activeServers--;
            }
            left++;
            }
            result[q[1]] = n - activeServers;
        }
        
        return result;
    }
}