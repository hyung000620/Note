import java.util.*;
class Solution {
     public static int[] solution(int[] answers) {
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int person1Cnt = 0;
        int person2Cnt = 0;
        int person3Cnt = 0;
        for(int i=0; i<answers.length; i++) {
            if(answers[i%answers.length] == person1[i%person1.length]) {
                person1Cnt++;
            }
            if(answers[i%answers.length] == person2[i%person2.length]) {
                person2Cnt++;
            }
            if(answers[i%answers.length] == person3[i%person3.length]) {
                person3Cnt++;
            }
        }
         
        int max = Math.max(person1Cnt , Math.max(person2Cnt, person3Cnt));
        List<Integer> preAns = new ArrayList<Integer>();

        if(max == person1Cnt) {
            preAns.add(1);
        }
        if(max == person2Cnt) {
            preAns.add(2);
        }
        if(max == person3Cnt) {
            preAns.add(3);
        }

        int[] answer = new int[preAns.size()];

        for(int i=0; i<preAns.size(); i++) {
            answer[i] = preAns.get(i);
        }  
        return answer;

    }

}
