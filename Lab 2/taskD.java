import java.io.*;
import java.util.*;
public class taskD {
    public static void main(String[]args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());
        int [] arr1 = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr1.length;i++){
            arr1[i] =  Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());  
        int n = Integer.parseInt(st.nextToken());
        int [] arr2 = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<arr2.length;i++){
            arr2[i] =  Integer.parseInt(st.nextToken());
        }
        int[] merged_arr = new int[N+n];
        int i = 0; 
        int j = 0;
        int k = 0;

        while(i<N && j<n){
            if(arr1[i]<arr2[j]){
                merged_arr[k] = arr1[i];
                k++;
                i++;
            }
            else{
               merged_arr[k] = arr2[j]; 
               k++;
               j++;
            }

        }
        while(i<N){
            merged_arr[k] = arr1[i];
            k++;
            i++;
        }
        while(j<n){
            merged_arr[k] = arr2[j];
            k++;
            j++;
        }
        StringBuilder sb = new StringBuilder();
        for(int m = 0;m<merged_arr.length;m++){
            sb.append(merged_arr[m]).append(" ");
        }
        System.out.println(sb.toString());
    }
}