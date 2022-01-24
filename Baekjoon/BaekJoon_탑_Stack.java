import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BaekJoon_탑_Stack {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Tower> top = new Stack<>();

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int num = 1; num <= N; num++) {
			int height = Integer.parseInt(st.nextToken());

			while (!top.isEmpty()) {
				if (top.peek().height < height) {
					top.pop();
				} else {
					System.out.print(top.peek().num + " ");
					break;
				}
			}

			if (top.empty()) {
				System.out.print("0 ");
			}

			top.push(new Tower(height, num));
		}

	}

	static class Tower {
		int height;
		int num;

		Tower(int h, int n) {
			height = h;
			num = n;
		}
	}

}