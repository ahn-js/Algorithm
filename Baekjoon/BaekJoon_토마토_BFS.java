package day1202;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon_토마토_BFS {

	static int[][] map;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static ArrayList<Point> oldTomato;
	static int timeCnt = -1; // 토마토를 다 익혀도 마지막으로 익은 애들이 que에 들어가기 때문에 while문이 한 번 더 돈다. 따라서 -1로 초기화
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken()); // 열
		int M = Integer.parseInt(st.nextToken()); // 행

		map = new int[M][N];
		oldTomato = new ArrayList<Point>();
		boolean zeroCheck = false;
		boolean freshCheck = false;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if (map[i][j] == 0) {
					zeroCheck = true; // 0이 하나라도 있다. 즉 모두 익은 상태가 아니다.
				}
				if (map[i][j] == 1) {
					oldTomato.add(new Point(i, j));
				}
//				System.out.print(map[i][j]+ " ");
			}
//			System.out.println();
		}

		bfs(M, N);
		
		for(int i=0; i<M; i++) { // 안익은 토마토 있는지 확인
			for(int j=0; j<N; j++) {
				if(map[i][j] == 0) {
					freshCheck = true;
					break;
				}
			}
		}
		
		if(zeroCheck == false) {
			System.out.println("0");
		} else if(freshCheck == true) {
			System.out.println("-1");
		} else {
			System.out.println(timeCnt);
		}

	}

	private static void bfs(int M, int N) {

		Queue<Point> que = new LinkedList<Point>(); // 큐를 선언하고 익은 토마토를 담은 list를 que에 옮겨 넣는다.
		for (int i = 0; i < oldTomato.size(); i++) {
			que.add(new Point(oldTomato.get(i).x, oldTomato.get(i).y));
		}

		
		while (!que.isEmpty()) {
			int size = que.size(); // 아직도 왜 따로 int에 size를 넣어놓고 반복문을 돌려야 하는지 이해가 안간다. 바로 que.size()만큼 돌리면 왜 결과값이 다를까?
			for (int i = 0; i < size; i++) {
				Point p = que.poll();

				for (int d = 0; d < 4; d++) {
					int nx = p.x + dx[d];
					int ny = p.y + dy[d];

					if (nx >= 0 && nx < M && ny >= 0 && ny < N && map[nx][ny] == 0) {
						map[nx][ny] = 1;
						que.add(new Point(nx, ny));
					}
				}
			}
			timeCnt++;
			
//			for(int i=0; i<M; i++) {
//				System.out.println();
//				for(int j=0; j<N; j++) {
//					System.out.print(map[i][j]+" ");
//				}
//			}
//			System.out.println(timeCnt);
		}
	}

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
