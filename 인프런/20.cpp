#include<iostream>

using namespace std; 

int main(){

    int n;
    int int_arr[101] = {0}; 

    cin >> n; 

    
    for (int i = 0 ; i< n ; i++){

        cin >> int_arr[i] ;

    }    
    
    for (int i = 0 ; i< n ; i++){
        int b; 
        cin >> b; 

        switch(int_arr[i] - b){ // A에서 B를 빼준다. 1: 가위 , 2 : 바위, 3: 보 
            case 0 : cout << "D" <<endl; break; // 비기는 경우는 같은 경우. 

            case -2 :
            case  1 : cout << "A" <<endl; break;  // A가 이기는 경우는 2-1, 3-2, 1-3. 

            case -1 : 
            case  2 : cout << "B" <<endl; break;  // B가 이기는 경우, 1-2, 2-3, 3-1 
            
        }

    }    
    return 0; 
}