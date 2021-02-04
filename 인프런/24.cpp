#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int main(){
 //   freopen("input.txt", "rt", stdin); 

    int n; 
    cin >> n; 
   

    vector<int> arr(n); 
    
    int tmp , tmp2 ; 

    cin >> tmp; 
   
    for(int i =1 ; i< n; i++){

        cin >> tmp2 ; 
        tmp = tmp - tmp2 ;     

        if (tmp < 0 ) tmp*= -1; 
        arr[tmp] = 1; 
 
        tmp = tmp2 ;  // tmp2를 다시 tmp에 넣어줄 것. 
        
    }

    

    for(int i= 1; i < n ; i++){
       
        if(arr[i] != 1) {
            cout << "NO" ; 
       
            return 0 ; 
        }
    }
    cout << "YES" ; 

    return 0; 

    
}