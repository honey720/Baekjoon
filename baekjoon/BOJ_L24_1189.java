import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_L24_1189 {
    static int ans = 0; //집까지 도착하는 경우 중 거리가 K인 가짓수
    static int R, C, K; //가로, 세로, 거리
    static char[][] map; //RxC 맵 정보
    static boolean[][] visit; //방문 확인용 백트래킹 RxC 맵 정보
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        map = new char[R + 1][C + 1];
        visit = new boolean[R + 1][C + 1];
        for(int i = 1; i <= R; i++) { //RxC 맵 정보 저장
            String input = br.readLine();
            for(int j = 1; j <= C; j++) {
                map[i][j] = input.charAt(j-1);
            }
        }
        visit[R][1] = true; //현수가 있는 위치 방문 확인
        find(R, 1, K); //백트래킹 시작
        System.out.println(ans); //정답 출력
        br.close();
    }

    static int[][] range = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; //상하좌우 이동 정보
    public static void find(int x, int y, int c) {
        if(c == 1) { //움직인 거리가 K일 경우
            if (x == 1 && y == C) { //현수의 위치가 집인지 확인
                ans++;
            }
        }
        else {
            for(int[] r : range) { //상하좌우 경우에 대한 반복문
                int x1 = x + r[0];
                int y1 = y + r[1];
                if((x1 > 0 && x1 <= R) && (y1 > 0 && y1 <= C) && !visit[x1][y1] && map[x1][y1] != 'T') {
                    //{x1, y1}이 맵 범위에 있는지, {x1, y1}이 이미 방문했는지, {x1, y1}가 T는 아닌지 확인
                    visit[x1][y1] = true; //백트래킹을 위한 방문 확인
                    find(x1, y1, c-1); //다음으로 이동
                    visit[x1][y1] = false; //백트래킹을 위한 방문 삭제
                }
            }
        }
    }
}
