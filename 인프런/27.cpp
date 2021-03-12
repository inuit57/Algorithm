#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int main(){
    int num ; 
    int arr[1001] = {0}; 

    cin >> num ; 

    bool flag = true; 
    for(int i = 2; i<= num ;i++){
        for(int k = 2; k< i ; k++){
            if( i%k == 0 ) {
                flag = false; 
                break;    
            }

        }
        if(flag){
            arr[i] = 1; 
        }
        flag = true;
    }
   
    int num_backup = num ; 
    while(num > 1){
       if(arr[num] != 0 ) {
           //이미 소수라면 
            arr[num]++;
             
       } else{ //소수가 아니라면 
            int tmp = num; 
            while(tmp > 1){
                // cout << tmp << "tmp check" <<endl ; 
                for(int i = 0 ; i<= tmp; i++){
                    if(arr[i] != 0){
                        if(tmp % i == 0){
                            tmp/= i; 
                            arr[i]++; 
                            // cout << arr[i] <<"++"<<endl; 
                            break;
                        }
                    }
                }
            }
       }
       num--; 
    //    cout <<"num -- " <<endl; 
    }
    
    cout << num_backup << " != "; 
    for(int i =0 ; i<= num_backup ; i++){
       //  if(arr[i] != 0 ) cout << i << endl; 
        if (arr[i] > 1 ) cout << (arr[i]-1) << " " ; 

    }

    return 0; 
   
}