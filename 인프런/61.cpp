#include<iostream>
#include<vector>
#include<stdio.h>
#include<algorithm>

using namespace std; 

int n ,m ; 
int check[10] = {0} ;
int arr[10] ;  
int cnt = 0 ; 

void d(int num , long sum){

    if ( num >= n ){
        
        if ( sum == m ) cnt++; 
        return ;  
    } else{
        check[num] = 1 ; 
        d(num+1 , sum + arr[num]) ; 
        d(num+1 , sum - arr[num]); 
        check[num] = 0 ; 
        d(num+1 , sum); 
        
    }

}
int main(){



    cin >> n >> m  ; 
    for(int i = 0 ; i< n; i++){
        cin >> arr[i] ; 
    }

    //long sum = 0 ; 
    d( 0  , 0); 
    

    if( cnt > 0) {
        cout << cnt <<endl; 
    }else{
        cout << -1  <<endl; 
    }
    return 0; 

}


// 특정 수 만들기
// 주어진 배열의 원소들을 더하거나 빼서 특정 수를 만드는 가짓수 헤아리기. 
