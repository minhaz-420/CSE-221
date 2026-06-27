import java.io.*;
import java.util.*;
public class taskC {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int [] arr_idx = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr_idx[i] = i+1;
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i]; 
                    arr[i] = arr[j]; 
                    arr[j] = temp;

                    int tempIdx = arr_idx[i]; 
                    arr_idx[i] = arr_idx[j]; 
                    arr_idx[j] = tempIdx;
                }
            }
        }
        boolean flag = false;

        for (int i = 0; i < n - 2; i++) {
            int target = x - arr[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) {
                    pw.println(arr_idx[i] + " " + arr_idx[left] + " " + arr_idx[right]);
                    flag = true;
                    break;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            if (flag){
                break;
            }
        }

        if (!flag){
           pw.println(-1);     
        } 

        pw.close();

    }
}
