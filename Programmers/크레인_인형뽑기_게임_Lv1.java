
// 인형이 열에 아무것도 없을때를 생각해야한다. 반복문을 다 돌고 스택검사와 push를 진행하지 않도록 처리.
import java.util.*;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int cnt = 0;
		int dollNum = 0;
		Stack<Integer> dollZip = new Stack<>();
		// System.out.println(Arrays.toString(board[0])); 0,0,0,0,0 출력 즉 맨위가 맨 처음
		// 즉 moves의 배열을 받고 그 값은 열값 고정하고 반복문으로 행 탐색해서 인형이 있는지 탐색
		int movesLength = moves.length;
		int boardRow = board.length;
		// System.out.println(movesLength);
		// System.out.println(boardRow);
		for (int i = 0; i < movesLength; i++) {
			for (int j = 0; j < boardRow; j++) {
				if (board[j][moves[i] - 1] > 0) {
					dollNum = board[j][moves[i] - 1];
					board[j][moves[i] - 1] = 0;
					if (!dollZip.isEmpty() && (dollZip.peek() == dollNum)) {
						dollZip.pop();
						answer += 2;
					} else {
						dollZip.push(dollNum);
					}
					dollNum = 0;
					break;
				}
			}
		}
		return answer;
	}
}