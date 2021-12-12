class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        while(a!=b){
            a = a%2 ==1? (a = (a+1)/2):(a=a/2);
            n = b%2 ==1? (b=(b+1)/2):(b=b/2);
            answer ++;
        }

        return answer;
    }
}
