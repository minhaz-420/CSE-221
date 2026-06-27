import java.io.*;
import java.util.*;

public class taskF {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int maxVal = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }

        int[] count = new int[maxVal + 1]; 
        int distinct = 0;
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < N; right++) {
            int num = arr[right];
            if (count[num] == 0) {
                distinct++;  
            }
            count[num]++;

            while (distinct > K) {
                int leftNum = arr[left];
                count[leftNum]--;
                if (count[leftNum] == 0) {
                    distinct--;  
                }
                left++;
            }

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
            }
        }

        System.out.println(maxLen);
    }
}