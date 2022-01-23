package day0803;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_달팽이_숫자 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC, N;
		TC = Integer.parseInt(br.readLine());

		for (int i = 0; i < TC; i++) {

			N = Integer.parseInt(br.readLine());
			int arr[][] = new int[N][N];
			int M = N;
			int x = 0;
			int y = -1;
			int num = 0;

			while (M > 0) {

				for (int j = 0; j < M; j++) { // 오른쪽
					y++;
					arr[x][y] = ++num;
				}

				M--; // N이 4일때 4 33 22 11 , N이 5라면 5 44 33 22 11 식으로 전개되기 때문에 M을 중간에 하나씩 감소시켜 줘야한다.

				for (int j = 0; j < M; j++) { // 아래쪽
					x++;
					arr[x][y] = ++num;
				}
				for (int j = 0; j < M; j++) { // 왼쪽
					y--;
					arr[x][y] = ++num;
				}

				M--;

				for (int j = 0; j < M; j++) { // 위쪽
					x--;
					arr[x][y] = ++num;
				}
			}
			
			System.out.println("#" + (i + 1) + " ");
			
			for (int k = 0; k < arr.length; k++) {
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[k][j] + " ");
				}
				System.out.println();
			}

		}
	}
}
