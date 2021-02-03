#include<stdio.h>
#include<iostream>

using namespace std; 

int main(){
    //freopen("input.txt", "rt", stdin); 
    int n , k ; 
    
    cin >> n >> k ; 

    int arr[n] = {0}; 
    int sum = 0 ;
    //int max = -999 ; 

    for (int i= 0 ; i< n; i++){
        cin >> arr[i] ; 
    }

    // 1~ K 번째까지 합을 구한다. 
    for(int i= 0 ; i< k ; i++){
        sum += arr[i] ; 
    }

    int max = sum; 


    //부분합 구하기. 
    //한칸씩 슬라이딩 시키면서 구해준다. 
    for(int i = 0 ; i< n-k ; i++){
        sum = sum - arr[i] + arr[k+i]; // 이게 + arr[n-1] 까지 가야한다.  K + i = n-1 .. // i = n-1-k 

        if ( max < sum) {
            max = sum ; 
        }
    }

    cout << max ; 

    return 0 ; 

}