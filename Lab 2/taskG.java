import java.io.*;
import java.util.*;
public class taskG {
    public static void main(String[]args) throws Exception{
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int cycle = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i<cycle;i++){
            st = new StringTokenizer(br.readLine());
            int low = Integer.parseInt(st.nextToken());
            int high = Integer.parseInt(st.nextToken());

            int left = 0; 
            int right = N;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] < low)
                    left = mid + 1;
                else
                    right = mid;
            }
            int L = left;

            left = 0;
            right = N;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (arr[mid] <= high)
                    left = mid + 1;
                else
                    right = mid;
            }
            int R = left;

            pw.println(R - L);
            pw.flush(); 
        }
    }
}
