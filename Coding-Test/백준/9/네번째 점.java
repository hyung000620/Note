import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<Integer,Integer> xMap = new HashMap<>();
		HashMap<Integer,Integer> yMap = new HashMap<>();

		for(int i=0; i<3; i++){
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			xMap.put(x,xMap.getOrDefault(x, 0)+1);
			yMap.put(y,yMap.getOrDefault(y, 0)+1);
		}

		StringBuilder sb = new StringBuilder();
		for(int k : xMap.keySet()){
			if(xMap.get(k) == 1) sb.append(k).append(" ");
		}

		for(int k : yMap.keySet()){
			if(yMap.get(k) == 1) sb.append(k);
		}

		System.out.println(sb);
    }
}
