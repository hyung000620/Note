class Solution {
    public static int[] dx={-1,0,1,0};
    public static int[] dy={0,-1,0,1};
    public int solution(String dirs) {
        int answer = 0;
        int[][] map = new int[11][11];
        boolean[][][] visit = new boolean[11][11][4];
        int x= 5, y=5;
        for(int i=0; i<dirs.length(); i++){
            char ch = dirs.charAt(i);
            int d=0;
            if(ch=='U') d= 0;
            else if(ch=='L') d= 1;
            else if(ch=='D') d= 2;
            else if(ch=='R') d= 3;
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx<0 || ny <0 || nx>=11 || ny>=11){
                continue;
            }

            if(!visit[nx][ny][d]){
                visit[nx][ny][d] = true;
                d =(d%2 == 0)? 2-d:4-d;
                visit[x][y][d] = true;
                answer ++;
            }
            x = nx;
            y = ny;
        }

        return answer;
    }
}
