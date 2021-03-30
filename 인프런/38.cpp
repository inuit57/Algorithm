#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

int check(int cnt,int size ,   int* answer){
    for(int i = 0 ; i< size ;i++){
        if ( answer[i]  == 0  ) cnt-- ; 
    }
    return cnt; 
}
int main(){
    int input_cnt  ; 
    cin >> input_cnt ; 

    int input[input_cnt] = {0}; 
    int answer[input_cnt] = {0} ; 

    for(int i = 0 ; i< input_cnt ; i++){
        cin >> input[i] ; 
    }
    for(int i = 0 ; i< input_cnt ; i++){
        int j = 0 ; 
        while(check(input[i] , input[i]+j , answer)!=0  || answer[input[i]+j]!=0 ){
            j++; 
        }
        answer[input[i]+j] = i+1; 
    }

    for(int i =0 ; i< input_cnt; i++){
        cout << answer[i] << " " ; 
    }


    return 0; 

}
