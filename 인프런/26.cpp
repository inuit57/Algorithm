#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int main(){
    // freopen("input.txt", "rt", stdin); 

    int n ; 
    cin >>  n; 
  
    //vector<vector<int>> arr(2,vector<int> (n)) ; // 전부 1등으로 초기화. 
    // 2중 벡터로 짜니까 시간초과가 나온다. 
    vector<int> a(n); 
    vector<int> b(n); 

    for(int i = 0 ; i< n; i++){
        cin >> a[i] ; 
        b[i] = i+1; 
    }

    for(int i= 0 ; i< n ; i++){
        for(int j =0 ; j< i ; j++){
            if ( a[i] > a[j]){ // 만약 현재 내 속도가 앞에 있는 선수들의 속도보다 빠르다면 등수 -1 
                b[i] -- ; 
            }
        }
    }

    for(int i = 0 ; i< n; i++){
        cout << b[i] << " "; 
    }

    return 0; 
   
}