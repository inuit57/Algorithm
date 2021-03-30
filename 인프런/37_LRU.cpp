#include<iostream>
#include<vector>
#include<stdio.h>

using namespace std; 

//만약에 있다면 그 위치를 반환 
int inCache(int num, int size, int* cache){
    for(int i = 0 ; i< size ; i++){
        if(cache[i] == num) {
            return i ; 
        }
    }
    return -1 ; 
}

int main(){
    int cache_size  , input_cnt  ; 
    cin >> cache_size >> input_cnt ; 

    // vector<int> arr(input_cnt) ;
    // vector<int> cache(cache_size) ; 

    int input[input_cnt] = {0}; 
    int cache[cache_size] ={0} ; 

    int tmp = 0 ; 
    int point = 0 ; 
    for(int i = 0 ; i< input_cnt ; i++){
        //cin >> input[i] ; 
        cin >> tmp ; 

         //안에 없다면 
        point = inCache(tmp , cache_size , cache) ;
        if ( point < 0 ) point = cache_size -1; 
        for(int i = point ; i > 0  ; i--){
           // cache[i+1] = cache[i] ; 
           cache[i] = cache[i-1] ; 
        }
        cache[0] = tmp ;  //한칸씩 밀어주고 저장. 
    
    }

    
    for(int i = 0 ; i< cache_size ; i++){
        cout << cache[i] << " " ; 
    }
    return 0; 

}
