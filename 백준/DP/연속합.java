// https://www.acmicpc.net/problem/1912

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i< n ; i++){
            arr[i] = scanner.nextInt();
        }

        int ans[] = new int[n] ;

        ans[0] = arr[0] ;

        for(int i = 1; i< n; i++){
            ans[i] = Math.max(arr[i], ans[i-1]+arr[i]); //이게 핵심이네
            // 현재 위치 값이랑 전에꺼까지 합이랑 더한 거랑 비교해서 처리...
        }

        int max = ans[0] ; // -1로 하면 -9 -8 -7 같은 경우에 제대로 값이 안 나올 수 있다. 
        for(int i = 0 ; i< n; i++){
            //System.out.println(i +":"+ans[i]);
            if ( max < ans[i] ){
               max = ans[i] ;
            }
        }
        System.out.println(max);
    }
}
