import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_햄버거_부분집합 {
	static int N, L; // 재료수, 제한 칼로리
	static Ingredient[] ingredients; // 각각의 맛점수와 칼로리를 가지는 재료 입력값
	static boolean[] select; // 부분집합 만들면서 재료를 부분집합에 넣을지 안넣을지 기록하는 배열
	static int maxScore;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int TC = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= TC; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			ingredients = new Ingredient[N];
			select = new boolean[N];
			maxScore = 0;

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				ingredients[i] = new Ingredient(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
			}

			subset(0);

			System.out.println("#" + tc + " " + maxScore);
		}
	}

	static void subset(int target) {
		if (target == N) {
			int sumCal = 0, sumScore = 0;
			for (int i = 0; i < N; i++) {
				if (select[i]) {
					sumCal += ingredients[i].cal;
					sumScore += ingredients[i].score;
				}
			}

			if (sumCal <= L) {
				maxScore = Math.max(maxScore, sumScore);
			}

			return;
		}

		select[target] = true;
		subset(target + 1);
		select[target] = false;
		subset(target + 1);
	}

	static class Ingredient {
		int score;
		int cal;

		Ingredient(int score, int cal) {
			this.score = score;
			this.cal = cal;
		}
	}
}
