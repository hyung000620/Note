class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int len = nums.length;
        for(int i=0; i<len-2; i++){
            for(int j=i+1; j<len-1; j++){
                for(int k=j+1; k<len; k++){
                    sum = nums[i]+nums[j]+nums[k];
                    if(sum%2!=0) answer += isPrime(sum);
                }
            }
        }

        return answer;
    }
    public int isPrime(int num){
        boolean flag = true;
        if(num<=7) return 1;
        for(int i=3; i<num; i++){
            if(num%i == 0) flag = false;
        }
        if(flag) return 1;
        return 0;
    }
}
