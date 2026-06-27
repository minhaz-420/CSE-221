import java.io.*;
import java.util.*;
public class taskH {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i = 0 ;i<N;i++){
            st =  new StringTokenizer(br.readLine());

            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int ignored_number = (k-1)/(x-1);
            System.out.println(k+ignored_number);

        }
    }
}
