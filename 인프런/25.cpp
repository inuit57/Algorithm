#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int main(){
    // freopen("input.txt", "rt", stdin); 

    int n ; 
    cin >>  n; 
    //int score; 

    vector<vector<int>> arr(2,vector<int> (n,1)) ; // 전부 1등으로 초기화. 

    for(int i = 0 ; i< n; i++){
        cin >> arr[0][i] ; 
    }

    for(int i= 0 ; i< n ; i++){
        for(int j= 0 ; j< n; j++){
            if ( arr[0][j] < arr[0][i] ) arr[1][j] ++ ; // 작은 경우 등수를 높여준다. 
        }
    }

    for(int i= 0 ; i < n ; i++){
        cout << arr[1][i] << " " ;
    }
    return 0; 
   
}