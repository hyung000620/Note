import java.util.*;

class Boxer implements Comparable<Boxer>{
    
    double winnum = 0;
    int swinnum =0;
    int weight = 0;
    int idx;
    public Boxer(double winnum,int swinnum, int weight,int idx){
        this.winnum = winnum;
        this.swinnum = swinnum;
        this.weight = weight;
        this.idx = idx;
    }
    
    public int compareTo(Boxer o){
        if(o.winnum-winnum>0){
            return 1;
        }else if(o.winnum-winnum<0){
            return -1;
        }else{
            if(o.swinnum-swinnum>0){
                return 1;
            }else if(o.swinnum - swinnum<0){
                return -1;
            }else{
                if(o.weight -weight>0){
                    return 1;
                }else if(o.weight - weight<0){
                    return -1;
                }else{
                    if(o.idx - idx<=0){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }
        }
       
    }
    
}


class Solution {
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        List<Boxer>boxerlist = new ArrayList();
        for(int i=0; i<answer.length; i++){
            int pan = head2head[i].replace("N","").length();
            int wincount = head2head[i].replace("N","").replace("L","").length();
           
            if(pan==0){
                boxerlist.add(new Boxer(0,checkwinnum(i,weights,head2head[i]),weights[i],i+1));
            }else{
                double winrate = ((double)wincount/pan);
                boxerlist.add(new Boxer(winrate,checkwinnum(i,weights,head2head[i]),weights[i],i+1));
            }
            
        
        }
        Collections.sort(boxerlist);
       
        
        for(int i=0; i<weights.length; i++){
            answer[i] = boxerlist.get(i).idx;
        }
        return answer;
    }
    
    public int checkwinnum(int idx, int[] weights, String head2head){
        int nowWeight = weights[idx];
        int cnt =0;
        String [] record = head2head.split("");
        for(int i=0; i<weights.length; i++){
            if(nowWeight<weights[i]){
                if(record[i].equals("W")){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
