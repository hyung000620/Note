import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        double M = Double.parseDouble(st.nextToken());
        double S = Double.parseDouble(st.nextToken());
        double G = Double.parseDouble(st.nextToken());

        double left = M/S;
        double right = M/G;

        st = new StringTokenizer(br.readLine()," ");
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");
        double L = Double.parseDouble(st.nextToken());
        double R = Double.parseDouble(st.nextToken());

        double lt = L/A+right;
        double rt = R/B+left;

        String str = lt<rt?"friskus":"latmask";

        System.out.println(str);
    }
}
