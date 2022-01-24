import java.util.*;

class Solution {
	public int solution(int n) {
		int answer = 0;
		Stack<Integer> num = new Stack<>();

		while (n > 0) {
			num.push(n % 3);
			n /= 3; // num을 줄여나가면서 while 종료
		}
		int i = 0;
		while (!num.isEmpty()) {
			answer += (num.pop() * (Math.pow(3, i)));
			i++;
		}

		return answer;

	}
}