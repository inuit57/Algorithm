#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int n  ; 
int check[10] = {0} ;
int arr[10] ;  

int MAX ; 
void d(int num ){

    if ( num >= n ){
        //print.. 
        int sum[2] = {0} ; 
        for(int i =0 ; i< n ; i++){
            sum[check[i]] += arr[i] ; 
        }

        if(sum[0] == sum[1]){
            //printf("YES\n"); 
            //printf("%d\n", sum[0]);
            if ( sum[0] > MAX) {
                MAX = sum[0] ; 
            } 
        }
        // //printf("\n");
        // printf("%d\n", sum) ; 
        // v_sum.push_back(sum) ; 
        return ;  
    } else{
        check[num] = 1 ; 
        d(num+1 ) ; 
        check[num] = 0 ; 
        d(num+1 ); 
    }

}
int main(){

    MAX = -1; 
    cin >> n ; 
    for(int i = 0 ; i< n; i++){
        cin >> arr[i] ; 
    }

    d( 0  ); 
    
    if (MAX > 0 ) {
        printf("YES"); 
//        return 0; 
    }else{
        printf("NO"); 
    }

    return 0; 

}

//합이 같은 부분집합.
//2개의 집합으로 나누었을 때 합이 같은 경우 YES를 출력.

// 생각보다 간단하게 풀렸다. 
// 0 , 1로 체크해서 2개의 집합으로 나누는 것이 풀이의 핵심 
