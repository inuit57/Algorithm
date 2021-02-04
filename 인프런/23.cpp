#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int main(){
   // freopen("input.txt", "rt", stdin); 
    int n ; 
    cin >> n; 
    
    vector<int> arr(n); 

    int len = 1; 
    int max = 1; 

    for(int i = 0 ; i< n; i++){
        cin >> arr[i] ; 
    }

    for(int i= 0 ; i< n; i++){
        if(arr[n-i] >= arr[n-i-1]){
            //cout << arr[n-i] << "," << arr[n-i-1] <<endl; 
            len++; 
        }
        else{
            if(max <= len){
                max = len;
              //  cout << len <<endl; 
            }
            len = 1 ; 
        }
    }

    if(max <= len){
        max = len;
    }
    cout << max; 

    
}