import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> remainDay = new Stack<>();
        
        for(int i=progresses.length-1; i>=0; i--){
            if((100-progresses[i])%speeds[i] == 0){
                remainDay.push((100-progresses[i])/speeds[i]);
            } else {
                remainDay.push((100-progresses[i])/speeds[i]+1);
            }
        }
       System.out.println(remainDay);
//        while (!remainDay.isEmpty()) {
// 		int cnt = 1;

// 		int top = remainDay.pop();

// 		while (!remainDay.isEmpty() && remainDay.peek() <= top) {
// 			cnt++;
// 			remainDay.pop();
// 		}

// 		ans.add(cnt);
// 	}
        while(!remainDay.isEmpty()){
            int cnt = 1;
            int top = remainDay.pop();
            while(!remainDay.isEmpty()){
                if(remainDay.peek() <= top){
                    remainDay.pop();
                    cnt++;
                    //System.out.println(remainDay);
                } else {
                    break;
                }
               // System.out.println(remainDay);
            }
            ans.add(cnt);
        }    
        //System.out.println(ans);
        answer = new int [ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i] = ans.get(i);
        }
        return answer;
    
    }
}