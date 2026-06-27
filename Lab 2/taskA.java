import java.io.*;
import java.util.*;
public class taskA {
    public static void main(String[]args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
       StringTokenizer st = new StringTokenizer(br.readLine());
       PrintWriter pw = new PrintWriter(System.out);

       int N = Integer.parseInt(st.nextToken());
       int S = Integer.parseInt(st.nextToken());

       int[] arr = new int[N];
       st = new StringTokenizer(br.readLine());

       for(int i = 0 ; i<arr.length;i++){
        arr[i] = Integer.parseInt(st.nextToken());
       }
       int i = 0;
       int j = arr.length-1;
       while(j>i){
        int sum = arr[i]+arr[j];
        if(sum == S){
            pw.print((i+1)+" "+(j+1));
            pw.flush();
            return;
        }
        else if(sum < S){
            i++;
        }
        else{
            j--;
        }
       }
       pw.println(-1);
       pw.close();
    }
}
