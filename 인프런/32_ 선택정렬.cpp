#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int main(){
//    freopen("input.txt", "rt", stdin); 

    int n ; 
    cin >>  n; 

    int arr[n] = {0} ; 

    for(int i = 0 ; i < n; i++){
        cin >> arr[i] ; 
    }

    for(int i = 0 ; i< n-1 ; i++){
        int idx  = i ; 
        for(int j = i+1 ; j < n ; j++){
            if( arr[idx] > arr[j]){
                idx = j ; 
            }
        }
        int tmp = arr[idx] ; 
        arr[idx] = arr[i] ; 
        arr[i] = tmp; 
    }


    for(int i = 0 ; i< n; i++){
        cout << arr[i] << " " ; 
    }
    return 0; 
   
}
