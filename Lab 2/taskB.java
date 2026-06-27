import java.io.*;
import java.util.*;
public class taskB {
  public static void main(String[]args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr1 = new int[N];
    st = new StringTokenizer(br.readLine());
    for(int i= 0 ; i<arr1.length;i++){
        arr1[i]= Integer.parseInt(st.nextToken());
    }

    int[] arr2 = new int[M];
    st = new StringTokenizer(br.readLine());
    for(int i= 0 ; i<arr2.length;i++){
        arr2[i]= Integer.parseInt(st.nextToken());
    }

    int i = 0; 
    int j = M-1;
    int clo_sum = 99999;
    int clo_i = 0;
    int clo_j = 0;

    while(i<N &&  j>=0){
        int sum = arr1[i]+arr2[j];
        if(Math.abs((K-clo_sum))>Math.abs((K-sum))){
            clo_sum = sum;
            clo_i = i;
            clo_j = j;
        }
        if(sum == K){
            pw.print((i+1)+" "+(j+1));
            pw.flush();
            return;
        }
        else if(sum<K){
            i++;
        }
        else{
            j--;
        }
    }
    pw.print((clo_i+1)+" "+(clo_j+1));
    pw.close();

  }  
}
