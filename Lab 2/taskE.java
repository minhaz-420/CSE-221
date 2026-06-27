import java.io.*;
import java.util.*;
public class taskE {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()); 
        int[] arr = new int[N];
        for(int i= 0 ; i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int best = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < N; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (right - left + 1 > best) {
                best = right - left + 1;
            }
        }

        System.out.println(best);
    }
}