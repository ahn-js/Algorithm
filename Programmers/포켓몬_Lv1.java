
// 조합으로 풀려고 했지만 접근이 잘못되었다. 문제를 보면 가장 많은 종류 한가지만 답으로 내면 되기 때문에 입력값에서 최대의 개수만 알 수 있으면 된다. 여러 조합을 뽑아놓고 찾을 필요가 없었다. 생각을 너무 꼬아서 하지 말자.
import java.util.*;

class Solution {
//    static boolean result[];
//    static int arr[];
//    static int maxCnt = 0;
	public int solution(int[] nums) {
		int answer = 0;
		int arr[] = new int[200001];
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
			if (arr[nums[i]] == 1) {
				cnt++;
			}
		}
		if (nums.length / 2 <= cnt) {
			cnt = nums.length / 2;
		}

		answer = cnt;

//        int myPoketmon =nums.length/2;
//        result = new boolean[nums.length];
//        comb(0,0,nums.length,myPoketmon, nums);
//        answer = maxCnt;

		return answer;
	}

//    void comb(int target, int cnt, int n, int r, int[] nums){
//        if(maxCnt == r){
//            return;
//        }
//        if(cnt == r){
//            int count = 0;
//            arr = new int[20001];
//            for(int i=0; i<result.length; i++){
//                if(result[i]){
//                    //System.out.print(nums[i]+" ");
//                    arr[nums[i]]++;
//                    if(arr[nums[i]] == 1){
//                        count++;
//                    }
//                }
//            }
//            maxCnt = Math.max(count, maxCnt);
//            //System.out.println();
//            return;
//        }
//        if(target >= n){
//            return;
//        }
//        result[target] = true;
//        comb(target+1, cnt+1, n, r, nums);
//        result[target] = false;
//        comb(target+1, cnt, n, r, nums);

//    }
}