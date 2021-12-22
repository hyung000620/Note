import java.util.*;
class Solution {
    public String solution(String s) {
        String[] tmp = s.split(" ");
        int[] arr = new int[tmp.length];
        
        for(int i=0; i<tmp.length; i++){
            arr[i] = Integer.parseInt(tmp[i]);
        }
        Arrays.sort(arr);
        
        return arr[0]+" "+arr[tmp.length-1];
    }
}
